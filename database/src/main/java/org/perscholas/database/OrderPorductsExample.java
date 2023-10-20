package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OrderPorductsExample {
   
	
	// 1) Create a connection to the database classic_models
	// 2) Use the scanner to take input of an order number
	// 3) Write a query using a prepared statement to print out the product_id, product name, 
	//    quantity ordered, msrp, buy_price, margin (msrp-buy_price), and total margin (margin * quantity ordered)
	// try to make the output look nice
	
	// DOUBLE BONUS
	// 4) use a java variable to calculate the total margin for the entire order (all products) 

	public static void main(String[] args) throws SQLException {
		 
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
				String user = "root";
				String password = "Murali@123";
				Connection connection = null;
				double totalOrderMargin = 0.0;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver"); // optional
					connection = DriverManager.getConnection(dburl, user, password);
					// 2) Use the scanner to take input of an order number
					Scanner scanner = new Scanner(System.in);
		            System.out.print("Enter an order number: ");
		            int orderNumber = scanner.nextInt();
					//String sql = "Select * FROM employees where firstname='"+firstname+"'";
		         // 3) Write a query using a prepared statement to print out the product_id, product name, 
		        	//    quantity ordered, msrp, buy_price, margin (msrp-buy_price), and total margin (margin * quantity ordered)
					String sql = "select p.id,p.product_name, "
							+ "od.quantity_ordered,p.msrp,p.buy_price , "
							+ "(p.msrp - p.buy_price)AS margin,"
							+ "(od.quantity_ordered)*(p.msrp-p.buy_price)AS totalmargin  "
							+ "from orders AS o "
							+ "join orderdetails AS od on o.id=od.order_id "
							+ "inner join products AS p on p.id=od.product_id "
							+ "where od.order_id= ?";//id=10100
					//PreparedStatement stmt = connection.prepareStatement(sql);
					PreparedStatement stmt = connection.prepareStatement(sql);
					stmt.setInt(1, orderNumber);
		                ResultSet result = stmt.executeQuery();
					
		                System.out.println("\nProductID\tProduct Name\t\t\tQuantity Ordered\tMSRP\tBuy Price\tMargin\t\tTotal Margin");
							while (result.next()) {
								String productCode = result.getString("id");
			                    String productName = result.getString("product_name");
			                    int quantityOrdered = result.getInt("quantity_Ordered");
			                    double msrp = result.getDouble("msrp");
			                    double buyPrice = result.getDouble("buy_Price");
			                    double margin = result.getDouble("margin");
			                    double totalMargin = result.getDouble("totalMargin");

			                    System.out.printf("%-12s%-40s%-20s%-10.2f%-20.2f%-10.2f%-6.2f%n",
			                            productCode, productName, quantityOrdered, msrp, buyPrice, margin, totalMargin);
			                    totalOrderMargin += totalMargin;
							}
							System.out.println("\n\n\bTotal Order Margin: " + totalOrderMargin);
					result.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (connection != null) {
						connection.close();
					}
				}
			}


}
