package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;

public class CustomerDAO {

	public Customer findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Customer c WHERE c.id = ?1"; // Example of HQL to get all records of user class
		
		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter(1, id);
		
		Customer result = query.getSingleResult();
		return result;
	}

	public List<Customer> findByFirstNameAndLastName(String fname,String Lname) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Customer c WHERE c.contactFirstname = :firstname AND c.contactLastname = :Lastname" ;
		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter("firstname", fname);
		query.setParameter("Lastname", Lname);
		
		List<Customer> result = query.getResultList();
		return result;
	}
}
