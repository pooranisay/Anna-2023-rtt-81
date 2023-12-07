package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.customer;
import org.perscholas.springboot.database.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface employeeDAO extends JpaRepository<employee, Long> {
    public employee findById(int id);

    @Query("SELECT c FROM employee c WHERE c.firstName = :firstName OR c.lastName = :lastName")
        //List<customer> findByFirstName(String firstName);
        //@Query("SELECT c FROM Customer c WHERE c.firstName LIKE :firstName or c.lastName LIKE :lastName")
        // change the query to search by first name OR last name
    List<employee> findByFirstNameOrLastName(String firstName, String lastName);
}
