
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
import org.perscholas.database.entity.Product;

public class ProductDAO {

	public Product findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM Product c WHERE c.id = :id";
		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter("id", id);
		try {
			Product result=query.getSingleResult();
			return result;
		}catch(NoResultException exe) {
			return null;
		}
	}
		public List<Product> findByName(String productname) {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
//			String hql = "From Customer c WHERE c.id = ?1";
			String hql = "From Product p WHERE p.productname like :productname ";
			TypedQuery<Product> query = session.createQuery(hql, Product.class);
			query.setParameter("productname",  "%"+productname+"%");

			List<Product> result = query.getResultList();
			session.close();
			return result;
		}
		
		public void save(Product save) {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			Transaction t=session.beginTransaction();
			session.saveOrUpdate(save);
			t.commit();
		}
		
		
		}
		
		/*SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Product c WHERE c.id = ?1"; // Example of HQL to get all records of user class
		
		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter(1, id);
		
		Product result = query.getSingleResult();
		return result;*/
	


