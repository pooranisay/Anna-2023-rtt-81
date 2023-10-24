package org.perscholas.database;

import org.perscholas.database.dao.ProductDAO;
import org.perscholas.database.entity.Product;

public class HibernateProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ProductDAO orderdao = new ProductDAO();
		
		Product product = orderdao.findById(103);
		
		System.out.println( product.getId() + " | " + product.getProductcode() );

	}

}
