package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.customerDAO;
import org.perscholas.springboot.database.entity.customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class customerController {

    // add a label to the existing form input for first name
    // add a 2nd form input for last name
    // change the controller to accept the new form input for last name as well as first name
    // change the query to search by first name OR last name
    // change the query to use like for both first name and last name
    // make both search fields populate the user input if it was given


    @Autowired
    private customerDAO customerDao;

    @GetMapping("/customer/search")
    public ModelAndView search(
            @RequestParam(required = false) String search,
            @RequestParam(required = false) String searchLastName) {
        ModelAndView response = new ModelAndView("customer/search");
        log.debug("In the customer search controller method: search parameter = " + search + ", searchLastName parameter = " + searchLastName);

// change the controller to accept the new form input for last name as well as first name
        // change the query to use like for both first name and last name

        if (search != null || searchLastName != null) {
            List<customer> customers = customerDao.findByFirstNameOrLastName(search, searchLastName);
            response.addObject("customerVar", customers);
            response.addObject("search", search);
            response.addObject("searchLastName", searchLastName);

            for (customer customer : customers) {
                log.debug("customer: id = " + customer.getId() + " last name = " + customer.getLastName());
            }
        }

        return response;
    }


    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView("customer/create");

        log.debug("In create customer with no args - log.debug");
        log.info("In create customer with no args - log.info");

        return response;
    }


    // the action attribute on the form tag is set to /customer/createSubmit so this method will be called when the user clicks the submit button
    @GetMapping("/customer/createSubmit")
    public ModelAndView createCustomerSubmit(CreateCustomerFormBean form) {
        ModelAndView response = new ModelAndView("customer/create");

        log.debug("firstName: " + form.getFirstName());
        log.info("lastName: " + form.getLastName());
        log.info("phone: " + form.getPhone());
        log.info("city: " + form.getCity());

        customer customer = new customer();
        customer.setFirstName(form.getFirstName());
        customer.setLastName(form.getLastName());
        customer.setPhone(form.getPhone());
        customer.setCity(form.getCity());

        customerDao.save(customer);

        log.info("In create customer with incoming args");

        return response;
    }


}
