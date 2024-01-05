package org.perscholas.springboot.database.dao;

import org.junit.jupiter.api.*;
import org.perscholas.springboot.database.entity.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class customerDAOTest {

    @Autowired
    private customerDAO customerDAO;

    @Test
    @Order(1)
    public void createCustomerTest(){
        //given
        customer customer=new customer();
        customer.setFirstName("Test Firstname");
        customer.setLastName("Test Lastname");
        customer.setCity("Test city");
        customer.setPhone("Test phone");
        customer.setUserId(0);

        //when
        customer=customerDAO.save(customer);


        //then

        Assertions.assertNotNull(customer.getId());
        Assertions.assertEquals("Test Firstname",customer.getFirstName());
        Assertions.assertEquals("Test Lastname",customer.getLastName());
        Assertions.assertEquals("Test city",customer.getCity());
        Assertions.assertEquals("Test phone",customer.getPhone());
        Assertions.assertEquals(0,customer.getUserId());



    }
    @Test
    @Order(2)
public void findByFirstNameOrLastNameTest(){
        //given
        String firstName="Test Firstname";

        //when
        List<customer> customers=customerDAO.findByFirstNameOrLastName(firstName,null);

        //then
        Assertions.assertEquals(1,customers.size());
        customer customer=customers.get(0);
        Assertions.assertNotNull(customer.getId());
        Assertions.assertEquals("Test Firstname",customer.getFirstName());
        Assertions.assertEquals("Test Lastname",customer.getLastName());
        Assertions.assertEquals("Test city",customer.getCity());
        Assertions.assertEquals("Test phone",customer.getPhone());
        Assertions.assertEquals(0,customer.getUserId());




    }
    @Test
    @Order(3)
    public void deletecreateCustomerTest(){
        //given
        String firstName="Test Firstname";

        //when
        int deleted=customerDAO.deleteByFirstName(firstName);

        //then
        Assertions.assertEquals(1,deleted);

    }
}
