package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Orderdetail;
import org.perscholas.database.entity.Product;

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
	
	
public Orderdetail findByOrderIdAndProductId(Integer orderId, Integer productId) {
		
	

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	String hql = "From Orderdetail o WHERE o.order.id = :order_id and o.product.id= :product_id";
	TypedQuery<Orderdetail> query = session.createQuery(hql, Orderdetail.class);
	query.setParameter("order_id",  orderId);
	query.setParameter("product_id",  productId);

	try {
		Orderdetail result = query.getSingleResult();
		session.close();
		return result;
	} catch (NoResultException nre) {
		return null;
	}
	}
	public void save(Orderdetail orderDetail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t =  session.beginTransaction();
		session.saveOrUpdate(orderDetail);
		t.commit();
		session.close();
	}

}
