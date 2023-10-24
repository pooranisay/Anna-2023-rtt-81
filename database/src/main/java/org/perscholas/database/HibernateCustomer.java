package org.perscholas.database;

import java.util.List;

import org.perscholas.database.dao.CustomerDAO;
import org.perscholas.database.entity.Customer;

public class HibernateCustomer {

	public static void main(String[] args) {
		CustomerDAO customerDao = new CustomerDAO();
		
		//Customer customer = customerDao.findById(103);
		String fname="julie";
		String lname="Brown";
		List<Customer> customer = customerDao.findByFirstNameAndLastName(fname,lname);
		for(Customer c:customer) {
			System.out.println( c.getId() + " | " + c.getContactFirstname()+"|" +c.getContactLastname());
		}
		
	}

}
