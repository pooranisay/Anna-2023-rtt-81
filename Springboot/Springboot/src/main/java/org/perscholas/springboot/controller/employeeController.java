package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.employeeDAO;
import org.perscholas.springboot.database.entity.customer;
import org.perscholas.springboot.database.entity.employee;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class employeeController {

    @Autowired
    private employeeDAO employeeDAO;

    @GetMapping("/employee/create")
    public ModelAndView createEmployee() {
        ModelAndView response = new ModelAndView("employee/create");

        log.info(" In create employee with no Args");
        return response;
    }


    @GetMapping("/employee/createSubmit")
    public ModelAndView createEmployee(CreateEmployeeFormBean form) {
        ModelAndView response = new ModelAndView("employee/create");

        log.info("firstname:" + form.getFirstName());
        log.info("lastname:" + form.getLastName());
        log.info("departmentname:" + form.getDepartmentName());


        employee employee = new employee();

        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartmentName());


        //  customerDAO.save(customer);
        employeeDAO.save(employee);

        log.info(" In create customer with  Args");
        return response;
    }
}