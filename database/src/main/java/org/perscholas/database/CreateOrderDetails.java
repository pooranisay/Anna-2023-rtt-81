package org.perscholas.database;

import java.util.List;
import java.util.Scanner;

import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.dao.OrderdetailDAO;
import org.perscholas.database.dao.ProductDAO;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.Orderdetail;
import org.perscholas.database.entity.Product;

public class CreateOrderDetails {
	
	private OrderDAO orderDAO =new OrderDAO();
	private OrderdetailDAO orderdetailDAO =new OrderdetailDAO();
	private ProductDAO productDAO=new ProductDAO();
	
	public void CreateOrderDetails() {
		
		// ask the user to enter a product name
		//Product p=productDAO.findById(15);
		//Order o=orderDAO.findById(10100);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a product name to add to your order:");
		String productname = scanner.nextLine();
				// looks up a product by a productName
				List<Product> products = productDAO.findByName(productname);
				
				if ( products.size() == 0 ) {
					System.out.println("You did not enter a valid proper product name");
					System.exit(0);
				}
				
				// the query for product name can return more that one product with the same name
				// so we list the products that were returned 
				for ( Product product : products ) {
					System.out.println("Product id " + product.getId() + " | " + product.getProductname());
				}
				
				// of the list of of product names that we show let the user select the id that they want to add
				System.out.println("Select a product Id:");
				Integer productId = scanner.nextInt();
				
				// the goal is to insert a record into the order details table
				Product p = productDAO.findById(productId);
				 if (p == null) {
			            System.out.println("The product with id "+ productId+ " does not exist" );
			            System.exit(0);
			        }
				
				 System.out.print("\nEnter a order id:");
			        Integer OrderId = scanner.nextInt();
			        
				// ask the user what order number they want to add the product too
				Order o = orderDAO.findById(10100);
				 if (o == null) {
			            System.out.println("The order with id "+ OrderId+ " does not exist" );
			            System.exit(0);
			        }
				// if the product is already part of the odrer do not add it again
//				for ( Orderdetail orderDetail : o.getOrderdetails() )  {
//					if ( orderDetail.getProduct().getId() == productId) {
//						// the product is already part of the order
//						System.out.println("The product " + p.getProductname() + " is already part of the order. can not add again");
//						System.exit(1);
//					}
//				}
				Orderdetail orderquery=	orderdetailDAO.findByOrderIdAndProductId(OrderId, productId);			
		
		Orderdetail od=new Orderdetail();
		od.setProduct(p);
		od.setOrder(o);
		od.setOrderlinenumber((short) 200);
		od.setPriceeach(5.55);
		od.setQuantityordered(300);
		orderdetailDAO.save(od);
	
		System.out.println("Successfully added product to order");
	//p.getOrderdetails().add(od);
		//orderDAO.save(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateOrderDetails cod=new CreateOrderDetails();
		cod.CreateOrderDetails();
	}

}
