package org.perscholas.database.dao;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Orderdetail;

public class OrderdetailDAO {

	public Orderdetail findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Orderdetail c WHERE c.id = ?1"; // Example of HQL to get all records of user class
		
		TypedQuery<Orderdetail> query = session.createQuery(hql, Orderdetail.class);
		query.setParameter(1, id);
		
		Orderdetail result = query.getSingleResult();
		return result;
	}

}
