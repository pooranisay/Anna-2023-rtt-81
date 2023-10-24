package org.perscholas.database;

import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.entity.Order;

public class HibernateOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
OrderDAO orderdao = new OrderDAO();
		
		Order order = orderdao.findById(103);
		
		System.out.println( order.getId() + " | " + order.getCustomerid() );

	}

}

