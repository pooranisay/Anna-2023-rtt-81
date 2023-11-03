package jpa.mainrunner;

import java.util.List;
import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	private Scanner scanner;
    private CourseService courseService;
    private StudentService studentService;
    private Student currentStudent;

    public SMSRunner() {
    	scanner = new Scanner(System.in);
        // Create the SessionFactory as needed
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        // Create the CourseService and StudentService instances with the required dependencies
        courseService = new CourseService(sessionFactory, courseService);
        studentService = new StudentService(sessionFactory, courseService);
    }

    public static void main(String[] args) {
        SMSRunner sms = new SMSRunner();
        sms.run();
    }

	private void run() {
		// Login or quit
		switch (menu1()) {
		case 1:
			if (studentLogin()) {
				registerMenu();
			}
			break;
		case 2:
			System.out.println("Goodbye!");
			break;
		default:
			System.out.println("Invalid selection. Goodbye!");
		}
	}

	private int menu1() {
		System.out.println("1. Student Login\n2. Quit Application");
		System.out.print("Please Enter Selection: ");
		return scanner.nextInt();
	}

	private boolean studentLogin() {
	    System.out.print("Enter your email address: ");
	    String email = scanner.next();
	    System.out.print("Enter your password: ");
	    String password = scanner.next();

	    boolean isValidStudent = studentService.validateStudent(email, password);

	    if (isValidStudent) {
	        currentStudent = studentService.getStudentByEmail(email);
	        List<Course> courses = studentService.getStudentCourses(email);
	        System.out.println("My Classes");
	        System.out.printf("%8s%35s%30s", "ID", "Course", "Instructor");
	        for (Course course : courses) {
	        	String formattedOutput = String.format("%n%n%8d%35s%30s", course.getcId(), course.getcName(), course.getcInstructorName());
                System.out.println(formattedOutput);
	        }
	        return true;
	    } else {
	        System.out.println("User validation failed. Goodbye!");
	        return false;
	    }
	}


	private void registerMenu() {
	    System.out.println("\n1. Register to Class\n2. Logout");
	    System.out.print("Please Enter Selection: ");

	    switch (scanner.nextInt()) {
	        case 1:
	            List<Course> allCourses = courseService.getAllCourses();
	            List<Course> studentCourses = studentService.getStudentCourses(currentStudent.getsEmail());

	            // Remove courses that the student is already registered for
	            allCourses.removeAll(studentCourses);

	            System.out.printf("%n%8s%35s%30s", "ID", "Course", "Instructor");
	            for (Course course : allCourses) {
	                String formattedOutput = String.format("%n%8d%35s%30s", course.getcId(), course.getcName(), course.getcInstructorName());
	                System.out.println(formattedOutput);
	            }

	            System.out.print("Enter Course Number: ");
	            int number = scanner.nextInt();

	            Course selectedCourse = courseService.getCourseById(number);

	            if (selectedCourse != null) {
	                if (studentCourses.contains(selectedCourse)) {
	                    System.out.println("You are already registered in that course!");
	                } else {
	                    // Register the student to the selected course
	                    studentService.registerStudentToCourse(currentStudent.getsEmail(), selectedCourse.getcId());

	                    // Update the student's course list
	                    currentStudent.getsCourses().add(selectedCourse);
	                    studentService.updateStudent(currentStudent);

	                    // Show the updated registered courses list for the student
	                    List<Course> studentCoursesUpdated = studentService.getStudentCourses(currentStudent.getsEmail());
	                    System.out.println("\nUpdated Registered Courses:");
	                    for (Course course : studentCoursesUpdated) {
	                    	String formattedOutput = String.format("%n%8d%35s%30s", course.getcId(), course.getcName(), course.getcInstructorName());
	    	                System.out.println(formattedOutput);
	                    }
	                    System.out.println("Registration successful!");
	                }
	            } else {
	                System.out.println("Course not found. Please enter a valid course number.");
	            }
	            break;
	        case 2:
	            System.out.println("Goodbye!");
	            break;
	        default:
	            System.out.println("Invalid selection. Goodbye!");
	    }
	}

}
