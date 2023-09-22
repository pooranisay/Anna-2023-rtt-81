package module303checking;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

	// this of this as the menu the coffee shop has to offer
	List<Product> products = new ArrayList<>();

	// this is the list of itmes in your order
	List<Product> order = new ArrayList<>();

	// this is a class member variable to make it easier
	Scanner input = new Scanner(System.in);

	public void setupProducts() {
		Product coffee = new Product();
		coffee.setName("Coffee");
		coffee.setPrice(5.44);
		products.add(coffee);

		Product tea = new Product();
		tea.setName("Tea");
		tea.setPrice(4.33);
		products.add(tea);

		Product cookie = new Product();
		cookie.setName("Cookie");
		cookie.setPrice(6.77);
		products.add(cookie);

		Product sandwich = new Product();
		sandwich.setName("Egg & Cheese Muffin");
		sandwich.setPrice(19.99);
		products.add(sandwich);
	}

	public void printProduct(Product product) {
		// TODO HOMEWORK : Change this print only the product name + tab + price with a
		// $
		System.out.println("Product name : " + product.getName() + " Price : " + product.getPrice());
	}

	public void printAllProducts() {
		for (Product product : products) {
			printProduct(product);
		}
	}

	public void example() {
		// the value in each product is the price
		double coffee = 5.44d;
		double tea = 4.33d;
		double cookie = 6.73d;

		double subTotal = 0;

		// 3 items of the first product
		subTotal = coffee * 1;

		// 4 items of the 2nd product
		subTotal = subTotal + (tea * 1);

		// 2 items of the 3rd product
		subTotal = subTotal + (cookie * 1);

		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println("Subtotal\t" + df.format(subTotal));

		double salesTax = subTotal * 0.10;
		System.out.println("Sales Tax\t" + df.format(salesTax));

		double totalSale = subTotal + salesTax;
		System.out.println("Total\t\t" + df.format(totalSale));
	}

	public int displayMainUserMenu() {
		System.out.println("1) Print the menu items and prices");
		System.out.println("2) Add an item to your order");
		System.out.println("3) Print the itmes in your order");
		System.out.println("4) Checkout");
		System.out.println("5) Exit");

		System.out.print("\nWhat do you want to do? ");
		int select = input.nextInt();
		input.nextLine();

		return select;
	}

	public void userSelectProduct() {
		System.out.print("Enter product name to order: ");
		String orderSelection = input.nextLine();

		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(orderSelection)) {
				order.add(product);
				System.out.println("Added " + product.getName() + " to your order.");
			}			
		}
	}
	
	
	public void userOrderedProduct()
	{
		System.out.println("Your Ordered Product(s) ");
		System.out.println("======================= ");
		for (Product product : order) {
			//if (product.getName().equalsIgnoreCase(orderSelection)) {
				//order.add(product);
				System.out.println(product.getName());
			//}
		}
		System.out.println("======================= ");
	}
	
	public void Checkout()
	{
		int coffeeCount=0;
		int teaCount=0;
		int cookieCount=0;
		int muffinCount=0;
		
		double perCoffee =0d;
		double perTea =0d;
		double perCookie =0d;
		double perMuffin=0d;
		
		
		
		for (Product product : order) {
			if(product.getName().equalsIgnoreCase("Coffee"))
			{
				coffeeCount++;
				perCoffee=product.getPrice();
			}
			if(product.getName().equalsIgnoreCase("Tea"))
			{
				teaCount++;
				perTea=product.getPrice();
			}
			if(product.getName().equalsIgnoreCase("Cookie"))
			{
				cookieCount++;
				perCookie=product.getPrice();
			}
			if(product.getName().equalsIgnoreCase("Egg & Cheese Muffin"))
			{
				muffinCount++;
				perMuffin=product.getPrice();
			}
		}
		
		double subTotal = 0;
		
		System.out.print("Product Name     ");
		System.out.print("Price            ");
		System.out.print("Total            ");
		System.out.println("");
		System.out.println("=================================================== ");
		System.out.println("");
		// 3 items of the first product
		if(coffeeCount>0){	
		  double totalCoffeePrice=0d;
		  totalCoffeePrice = perCoffee * coffeeCount;
		  System.out.print("Coffee : "+ "X"+coffeeCount+"");
		  System.out.print("\t"+perCoffee);
		  //System.out.print(coffeeCount);
		  System.out.print("\t\t"+totalCoffeePrice);
		  subTotal=subTotal+totalCoffeePrice;
		  System.out.println("");
		}
		
		if(teaCount>0)
		{
		// 4 items of the 2nd product
		double totalTeaPrice=0d;
		totalTeaPrice = (perTea * teaCount);
		  System.out.print("Tea : "+" X " + teaCount +" ");
		  System.out.print("\t"+perTea );
		  System.out.print("\t\t"+totalTeaPrice);
		  subTotal=subTotal+totalTeaPrice;
		  System.out.println("");
		}

		if(cookieCount>0)
		{
		// 2 items of the 3rd product
			double totalCookiePrice=0d;
			totalCookiePrice = (perCookie * cookieCount);
			  System.out.print("Cookie : "+" X " + cookieCount+"");
			  System.out.print("\t"+perCookie );
			  System.out.print("\t\t"+totalCookiePrice);
			  subTotal=subTotal+totalCookiePrice;
			  System.out.println("");
		
		}
		
		if(muffinCount>0)
		{
		// 2 items of the 3rd product
			double totalMuffinPrice=0d;
			totalMuffinPrice = (perMuffin * 1);
			  System.out.print("Egg & Cheese Muffin : ");
			  System.out.print(perMuffin + " X " + muffinCount);
			  System.out.print(totalMuffinPrice);
			  subTotal=subTotal+totalMuffinPrice;
			  System.out.println("");
		
		}

		System.out.println("=================================================== ");
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println("Subtotal\t" + df.format(subTotal));

		double salesTax = subTotal * 0.10;
		System.out.println("Sales Tax\t" + df.format(salesTax));

		System.out.println("=================================================== ");
		double totalSale = subTotal + salesTax;
		System.out.println("Total\t\t" + df.format(totalSale));
		System.out.println("==================================================== ");

		
		
	}

	public static void main(String[] args) {
		CoffeeShop cf = new CoffeeShop();
		cf.setupProducts();

		while (true) {
			int userSelection = cf.displayMainUserMenu();
			
			if (userSelection == 1) {
				cf.printAllProducts();
			} else if (userSelection == 2) {
				cf.userSelectProduct();
			} else if (userSelection == 3 ) {
				// TODO HOMEWOK - display the products in the order list here
				cf.userOrderedProduct();
			} 
			else if (userSelection == 4 ) {
				// TODO HOMEWOK - display the products in the order list here
				cf.Checkout();
			}else if ( userSelection == 5) {
				System.exit(0);
			} else {
				System.out.println("User input " + userSelection + " is unknonw.   Try again;");
			}
		}
	}
}
