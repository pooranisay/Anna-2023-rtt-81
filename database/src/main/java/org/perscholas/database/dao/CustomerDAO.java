package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;

public class CustomerDAO {

	public Customer findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Customer c WHERE c.id = :id"; // Example of HQL to get all records of user class
		
		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter("id", id);
		
		try {
			
				Customer result = query.getSingleResult();
				session.close();
		return result;
		}catch(NoResultException exe) {
			return null;
		}
	}

	public List<Customer> findByFirstNameAndLastName(String fname,String Lname) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Customer c WHERE c.contactFirstname = :firstname AND c.contactLastname = :Lastname" ;
		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter("firstname", fname);
		query.setParameter("Lastname", Lname);
		
		List<Customer> result = query.getResultList();
		session.close();
		return result;
	}
	public void save(Customer save) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t=session.beginTransaction();
		session.saveOrUpdate(save);
		t.commit();
		
	}
}
