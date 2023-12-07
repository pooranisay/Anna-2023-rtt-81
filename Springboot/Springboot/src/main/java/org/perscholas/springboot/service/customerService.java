package org.perscholas.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.customerDAO;
import org.perscholas.springboot.database.entity.customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class customerService {

    @Autowired
    private customerDAO customerDao;
    public customer createCustomer(CreateCustomerFormBean form){
        log.debug("id"+form.getId());
        log.debug("firstName"+form.getFirstName());
        log.info("lastName"+form.getLastName());
        log.info("phone"+form.getPhone());
        log.info("city"+form.getCity());

        customer customer=customerDao.findById(form.getId());

        if(customer==null){
            customer=new customer();
        }
        customer.setId(form.getId());
        customer.setFirstName(form.getFirstName());
        customer.setLastName(form.getLastName());
        customer.setPhone(form.getPhone());
        customer.setCity(form.getCity());
       return  customerDao.save(customer);
        //return customer;
    }
}
