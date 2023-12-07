package org.perscholas.springboot.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.customerDAO;
import org.perscholas.springboot.database.dao.employeeDAO;
import org.perscholas.springboot.database.entity.employee;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.perscholas.springboot.service.customerService;
import org.perscholas.springboot.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class employeeController {

    // add a label to the existing form input for first name
    // add a 2nd form input for last name
    // change the controller to accept the new form input for last name as well as first name
    // change the query to search by first name OR last name
    // change the query to use like for both first name and last name
    // make both search fields populate the user input if it was given


    @Autowired
    private employeeDAO employeeDao;

    @Autowired
    employeeService employeeservice;

    @GetMapping("/employee/search")
    public ModelAndView search(
            @RequestParam(required = false) String search,
            @RequestParam(required = false) String searchLastName) {
        ModelAndView response = new ModelAndView("employee/search");
        log.debug("In the employee search controller method: search parameter = " + search + ", searchLastName parameter = " + searchLastName);

// change the controller to accept the new form input for last name as well as first name
        // change the query to use like for both first name and last name

        if (search != null || searchLastName != null) {
            List<employee> employees = employeeDao.findByFirstNameOrLastName(search, searchLastName);
            response.addObject("employeeVar", employees);

            response.addObject("search", search);
            response.addObject("searchLastName", searchLastName);

            for (employee employee : employees) {
                log.debug("employee: id = " + employee.getId() + " last name = " + employee.getLastName());
            }
        }

        return response;
    }


    @GetMapping("/employee/create")
    public ModelAndView createEmployee() {
        ModelAndView response = new ModelAndView("employee/create");

        log.debug("In create employee with no args - log.debug");
        log.info("In create employee with no args - log.info");

        return response;
    }


    // the action attribute on the form tag is set to /customer/createSubmit so this method will be called when the user clicks the submit button
    @GetMapping("/employee/createSubmit")
    public ModelAndView createEmployeeSubmit(@Valid CreateEmployeeFormBean form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.info("######################### In create employee submit - has errors #########################");
            ModelAndView response = new ModelAndView("employee/create");

            for (ObjectError error : bindingResult.getAllErrors()) {
                log.info("error: " + error.getDefaultMessage());
            }

            response.addObject("form", form);
            response.addObject("errors", bindingResult);
            return response;
        }

        log.info("######################### In create Employee submit - no error found #########################");
        employee c=employeeservice.CreateEmployee(form);

        ModelAndView response = new ModelAndView();
        response.setViewName("redirect:/employee/edit/" + c.getId() + "?success=Customer Saved Successfully");

        return response;
    }

    @GetMapping("/employee/edit/{id}")
    public ModelAndView editEmployee(@PathVariable int id) {
        ModelAndView response = new ModelAndView("employee/create");

        employee employee=employeeDao.findById(id);
        CreateEmployeeFormBean form=new CreateEmployeeFormBean();
        if(employee !=null){
            form.setId(employee.getId());
            form.setFirstName(employee.getFirstName());
            form.setLastName(employee.getLastName());
            form.setDepartmentName(employee.getDepartmentName());

        }else{
            log.warn("employee with id"+id+"was not found");
        }
        response.addObject("form",form) ;
        return response;

    }
}
