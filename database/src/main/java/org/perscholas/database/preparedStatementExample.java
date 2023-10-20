package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class preparedStatementExample {

	public static void main(String[] args) throws SQLException {
		 
String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "Murali@123";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // optional
			connection = DriverManager.getConnection(dburl, user, password);
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Employee First Name");
			String firstname=scanner.nextLine();
			System.out.println("Enter Employee Last Name");
			String lastname=scanner.nextLine();
			//String sql = "Select * FROM employees where firstname='"+firstname+"'";
			String sql = "SELECT * FROM employees WHERE firstname = ? AND lastname = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, firstname);
			stmt.setString(2, lastname);
			ResultSet result = stmt.executeQuery();
					while (result.next()) {
				Integer id = result.getInt("id");
				firstname = result.getString("firstname");
				lastname=result.getString("lastname");
				String email = result.getString("email");
				System.out.println(id + " | " + firstname + " | " +lastname+"|"+ email);
			}
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
