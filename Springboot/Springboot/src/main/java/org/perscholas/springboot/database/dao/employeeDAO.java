package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeDAO extends JpaRepository<employee, Long> {
}
