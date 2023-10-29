package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;

public class OrderDAO {

	public Order findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		/*String hql = "FROM Order c WHERE c.id = ?1"; // Example of HQL to get all records of user class
		
		TypedQuery<Order> query = session.createQuery(hql, Order.class);
		query.setParameter(1, id);
		
		Order result = query.getSingleResult();
		return result;*/
		String hql = "FROM Order o WHERE o.id = :id"; // Example of HQL to get all records of user class

		TypedQuery<Order> query = session.createQuery(hql, Order.class);
		query.setParameter("id", id);

		try {
			Order result = query.getSingleResult();
			return result;
		} catch (NoResultException nre) {
			return null;
	}}
public List<Order> findByCustomerId(Integer customerid){
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	/*String hql = "FROM Order c WHERE c.customerid = ?1";
	TypedQuery<Order> query = session.createQuery(hql, Order.class);
	query.setParameter(1, customerid);
	List<Order>result=query.getResultList();
	
	return result;*/
	// Example of HQL to get all records of user class
			// SQL is : select * from customers c where c.contact_firstname = :firstname and
			// c.contact_lastname = :lastname
			String hql = "FROM Order o WHERE o.customerid = :customerid";

			TypedQuery<Order> query = session.createQuery(hql, Order.class);
			query.setParameter("customerid", customerid);

			List<Order> result = query.getResultList();
			return result;
}

public List<Order> findByStatus(String status){
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	String hql = "FROM Order c WHERE c.status = :status";
	TypedQuery<Order> query = session.createQuery(hql, Order.class);
	query.setParameter("status", status);
	List<Order>result=query.getResultList();
	
	return result;
}
public void save(Order save) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction t=session.beginTransaction();
	session.saveOrUpdate(save);
	t.commit();
}
}
