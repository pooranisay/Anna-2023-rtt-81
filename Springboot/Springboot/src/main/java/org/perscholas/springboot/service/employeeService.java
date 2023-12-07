package org.perscholas.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.customerDAO;
import org.perscholas.springboot.database.dao.employeeDAO;
import org.perscholas.springboot.database.entity.customer;
import org.perscholas.springboot.database.entity.employee;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class employeeService {
    @Autowired
    private employeeDAO employeeDao;
    public employee CreateEmployee(CreateEmployeeFormBean form){
        log.debug("id"+form.getId());
        log.debug("firstName"+form.getFirstName());
        log.info("lastName"+form.getLastName());
        log.info("DepartmentName"+form.getDepartmentName());


        employee employee=employeeDao.findById(form.getId());

        if(employee==null){
            employee=new employee();
        }
        employee.setId(form.getId());
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartmentName());
        return employeeDao.save(employee);
    }
}
