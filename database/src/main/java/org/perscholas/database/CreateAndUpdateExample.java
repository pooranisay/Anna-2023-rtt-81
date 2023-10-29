package org.perscholas.database;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.perscholas.database.dao.CustomerDAO;
import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;

public class CreateAndUpdateExample {
	private OrderDAO orderdao=new OrderDAO();
	
public void insertOrderExample() {
	Order o=new Order();
	System.out.println("Order id before save"+o.getId());
	if(o!=null) {
		o.setId(10100);
		
		//o.setCustomerid(363);
		//Date date='2003,01,06'
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");
	        try {
	            Date date = sdf.parse("2003,01,06");
	            o.setOrderDate(date);
	        } catch (ParseException e) {
	            e.printStackTrace(); // Handle parsing exception
	        }
	        try {
	            Date date = sdf.parse("2003,01,13");
	            o.setRequiredDate(date);
	        } catch (ParseException e) {
	            e.printStackTrace(); // Handle parsing exception
	        }
	        try {
	            Date date = sdf.parse("2023,01,10");
	            o.setShippedDate(date);
	        } catch (ParseException e) {
	            e.printStackTrace(); // Handle parsing exception
	        }
		//o.setShippedDate(null);
		o.setStatus("Shipped");
		
		orderdao.save(o);;
		System.out.println("Customer id after save"+o.getId());
	}else {
		System.out.println("Order does not exit");
	}
}
	public void UpdateOrderExample() {
		Order o=orderdao.findById(10100);
		
		//System.out.println("Customer id"+o.getCustomerid());
	
		System.out.println("status before save"+o.getStatus());
		System.out.println("Comments before save"+o.getComments());
		o.setStatus("shipped");
		o.setComments("modified october 24 by Anna");
		orderdao.save(o);
		System.out.println("status  after save"+o.getStatus());
		System.out.println("Comments after save"+o.getComments());
	}
	public void listQuery() {
		List<Order>shipped=orderdao.findByStatus("Shipped");
		System.out.println("\nWe found "+shipped.size()+" Shipped records in the database");
		List<Order>cancelled=orderdao.findByStatus("Cancelled");
		System.out.println("\nWe found "+cancelled.size()+" Cancelled records in the database");
		List<Order>onhold=orderdao.findByStatus("On Hold");
		System.out.println("\nWe found "+onhold.size()+" On Hold records in the database");
		List<Order>inprocess=orderdao.findByStatus("In Process");
		System.out.println("\nWe found "+inprocess.size()+" In Process records in the database");
		
	}
	/*private CustomerDAO customerdao=new CustomerDAO();
	
	public void insertCustomerExample() {
		Customer c=new Customer();
		if(c!=null) {
		c.setCustomerName("Series  Reminder");
		c.setContactFirstname("Eric");
		c.setContactLastname("Heiling");
		c.setAddressLine1("Adress Line 1");;
		c.setAddressLine2("Address Line 2");
		c.setCity("Denver");
		c.setState("Colorado");;
		c.setCreditLimit(10000.00d);
		c.setPhone("555-555-1212");
		c.setCountry("USA");
		
		System.out.println("Customer id before save"+c.getId());
		customerdao.save(c);
		System.out.println("Customer id after save"+c.getId());
		}else {
			System.out.println("Customer does not exit");
		}
		
	}
	
	public void UpdateCustomerExample() {
		Customer c=customerdao.findById(103);
		
		System.out.println("Customer Name:"+c.getCustomerName());
		c.setContactFirstname("Updated Firstnmae1");
		c.setContactLastname("Updated Lastnmae");
		c.setCreditLimit(5555.55);
		System.out.println("Customer id before save"+c.getId());
		customerdao.save(c);
		System.out.println("Customer id after save"+c.getId());
	}
	
	public void listQuery() {
		List<Customer>customers=customerdao.findByFirstNameAndLastName("Eric", "Heiling");
		System.out.println("\nWe found"+customers.size()+"records in the database");
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateAndUpdateExample caue=new CreateAndUpdateExample();
		//caue.insertCustomerExample();
		//caue.UpdateCustomerExample();
		//caue.insertOrderExample();
		//caue.UpdateOrderExample();
		caue.listQuery();
	}

}
