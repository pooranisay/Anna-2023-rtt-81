package org.perscholas.springboot.controller;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.customerDAO;
import org.perscholas.springboot.database.entity.customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.service.customerService;
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
public class customerController {

    // add a label to the existing form input for first name
    // add a 2nd form input for last name
    // change the controller to accept the new form input for last name as well as first name
    // change the query to search by first name OR last name
    // change the query to use like for both first name and last name
    // make both search fields populate the user input if it was given


    @Autowired
    private customerDAO customerDao;

    @Autowired
    customerService customerservice;

    @GetMapping("/customer/search")
    public ModelAndView search(
            @RequestParam(required = false) String search,
            @RequestParam(required = false) String searchLastName) {
        ModelAndView response = new ModelAndView("customer/search");

        log.debug("in the customer search controller method : first name = " + search + " last name = " + searchLastName);

        if (!StringUtils.isEmpty(search) || !StringUtils.isEmpty(searchLastName)) {

            response.addObject("firstNameSearch", search);
            response.addObject("lastNameSearch", searchLastName);

            if (!StringUtils.isEmpty(search)) {
                search = "%" + search + "%";
            }

            if (!StringUtils.isEmpty(searchLastName)) {
                searchLastName = "%" + searchLastName + "%";
            }

            // we only want to do this code if the user has entered either a first name or a last name
            List<customer> customers = customerDao.findByFirstNameOrLastName(search, searchLastName);

            response.addObject("customerVar", customers);


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
    public ModelAndView createCustomerSubmit(@Valid CreateCustomerFormBean form, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            log.info("######################### In create customer submit - has errors #########################");
            ModelAndView response = new ModelAndView("customer/create");

            for (ObjectError error : bindingResult.getAllErrors()) {
                log.info("error: " + error.getDefaultMessage());
            }

            response.addObject("form", form);
            response.addObject("errors", bindingResult);
            return response;
        }

        log.info("######################### In create customer submit - no error found #########################");

        customer c = customerservice.createCustomer(form);

        // the view name can either be a jsp file name or a redirect to another controller method
        ModelAndView response = new ModelAndView();
        response.setViewName("redirect:/customer/edit/" + c.getId() + "?success=Customer Saved Successfully");

        return response;

    }

    @GetMapping("/customer/edit/{id}")
   // public ModelAndView editCustomer(@PathVariable int id) {
        public ModelAndView editCustomer(@PathVariable int id, @RequestParam(required = false) String success) {
            log.info("######################### In /customer/edit #########################");
            ModelAndView response = new ModelAndView("customer/create");

            customer customer = customerDao.findById(id);

            if (!StringUtils.isEmpty(success)) {
                response.addObject("success", success);
            }

            CreateCustomerFormBean form = new CreateCustomerFormBean();

            if (customer != null) {
                form.setId(customer.getId());
                form.setFirstName(customer.getFirstName());
                form.setLastName(customer.getLastName());
                form.setPhone(customer.getPhone());
                form.setCity(customer.getCity());
            } else {
                log.warn("Customer with id " + id+ " was not found");
            }

            response.addObject("form",form) ;
        return response;

    }
}
