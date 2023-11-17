package jpa.service;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

public class StudentServicetest {

    @Test
    public void testValidStudent() {
        StudentService validator = new StudentService();
        //check condition for valid username and password
        String email = "hluckham0@google.ru";
        String password = "X1uZcoIh0dj";
        
        boolean actual = validator.validateStudent(email, password);
        
        // Add assertions to verify the expected outcome of the test
        assertTrue(actual); //this should be true for a valid student
    }
    
    @Test
    public void testnotValidStudent() {
       	StudentService validator = new StudentService();
        //check condition if both email and password not valid
       	String email = "jhsdfhjfds123jhsdfjh";
        String password = "jhvhj123jhfd";
        
        boolean actual = validator.validateStudent(email, password);
        
        // Add assertions to verify the expected outcome of the test
        assertFalse(actual); // this should be true for a valid student
    }
    
    @Test
    public void testemailnotValidStudent() {
       	StudentService validator = new StudentService();
        //check condition for the invalid email with valid password
       	String email = "jhsdfhjfdsjhsdfjh";
        String password = "X1uZcoIh0dj";
        
        boolean actual = validator.validateStudent(email, password);
        
        // Add assertions to verify the expected outcome of the test
        assertFalse(actual); // this should be true for a valid student
    }
    @Test
    public void testpasswordnotValidStudent() {
       	StudentService validator = new StudentService();
        //check condition for valid email with invalid password
       	String email = "hluckham0@google.ru";
        String password = "xxxxxxxx";
        
        boolean actual = validator.validateStudent(email, password);
        
        // Add assertions to verify the expected outcome of the test
        assertFalse(actual); // this should be true for a valid student
    }
    
    @Test
    public void testnonstringemail() {
       	StudentService validator = new StudentService();
        //check condition for numeric email with numeric password 
       	String email = "12222222222";
        String password = "12222222";
        
        boolean actual = validator.validateStudent(email, password);
        
        // Add assertions to verify the expected outcome of the test
        assertFalse(actual); // this should be true for a valid student
    }
    
    @Test
    public void testnonstringpassword() {
       	StudentService validator = new StudentService();
        //check condition for valid email with numeric password
       	String email = "hluckham0@google.ru";
        String password = "12334455";
        
        boolean actual = validator.validateStudent(email, password);
        
        // Add assertions to verify the expected outcome of the test
        assertFalse(actual); // this should be true for a valid student
    }
}