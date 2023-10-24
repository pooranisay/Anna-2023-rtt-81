package org.perscholas.database;

import org.perscholas.database.dao.OrderdetailDAO;
import org.perscholas.database.entity.Orderdetail;

public class HibernateOrderdetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
OrderdetailDAO orderdao = new OrderdetailDAO();
		
		Orderdetail order = orderdao.findById(103);
		
		System.out.println( order.getOrderid() + " | " + order.getProductid() );

	}

}

