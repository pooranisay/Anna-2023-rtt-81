package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface customerDAO extends JpaRepository<customer, Long> {

    public customer findById(int id);

    @Query("SELECT c FROM customer c WHERE c.firstName = :firstName OR c.lastName = :lastName")
    //List<customer> findByFirstName(String firstName);
        // change the query to search by first name OR last name
    List<customer> findByFirstNameOrLastName(String firstName, String lastName);


}



