package jpa.service;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService {

	private StudentDAO studentDAO;
	private CourseDAO courseDAO;

	public StudentService(StudentDAO studentDAO, CourseDAO courseDAO) {
		this.studentDAO = studentDAO;
		this.courseDAO = courseDAO;
	}

	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

	public Student getStudentByEmail(String sEmail) {
		return studentDAO.getStudentByEmail(sEmail);
	}

	public boolean validateStudent(String sEmail, String sPassword) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "SELECT COUNT(*) FROM Student WHERE sEmail = :email AND sPass = :password";
		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("email", sEmail);
		query.setParameter("password", sPassword);

		Student result = query.getSingleResult();
		session.close();
		factory.close();

		return result != null;
	}

	public void registerStudentToCourse(String sEmail, int cId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = " SELECT FROM Student WHERE sEmail = :email";
		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("email", sEmail);

		Student student = query.getSingleResult();

		if (student != null) {
			Course course = session.load(Course.class, cId);

			if (course != null) {
				List<Course> studentCourses = student.getsCourses();

				if (!studentCourses.contains(course)) {
					studentCourses.add(course);
					session.update(student);
				}
			}
		}
	}

	public List<Course> getStudentCourses(String sEmail) {
					SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			String hql = "SELECT c FROM Student s JOIN s.sCourses c WHERE s.sEmail = :email";
			TypedQuery<Course> query = session.createQuery(hql, Course.class);
			query.setParameter("email", sEmail);

			return query.getResultList();
	
		
		
		
		
		
	}

}
