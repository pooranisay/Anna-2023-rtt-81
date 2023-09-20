package module303checking;

public class CafeOrder {

	public static void main(String[] args) {
        // Define product names and their respective prices
        String product1 = "Coffee";
        double price1 = 2.50;
        String product2 = "Cappuccino";
        double price2 = 3.00;
        String product3 = "Espresso";
        double price3 = 2.00;

        // Define quantities for each product in the order
        int quantityProduct1 = 3;
        int quantityProduct2 = 4;
        int quantityProduct3 = 2;

        // Calculate subtotal
        double subtotal = (price1 * quantityProduct1) + (price2 * quantityProduct2) + (price3 * quantityProduct3);

        // Define sales tax rate as a constant
        final double SALES_TAX_RATE = 0.08; // 8% sales tax

        // Calculate total sale amount including sales tax
       // double salesTax = subtotal * SALES_TAX_RATE;
        double totalSale = subtotal + SALES_TAX_RATE;

        // Format results to two decimal places
        String formattedSubtotal = String.format("%.2f", subtotal);
       // String formattedSalesTax = String.format("%.2f", salesTax);
        String formattedTotalSale = String.format("%.2f", totalSale);

        // Display the order details
        System.out.println("Cafe Order Details:");
        System.out.println("1. " + product1 + " x " + quantityProduct1 + " @ $" + price1 + " each");
        System.out.println("2. " + product2 + " x " + quantityProduct2 + " @ $" + price2 + " each");
        System.out.println("3. " + product3 + " x " + quantityProduct3 + " @ $" + price3 + " each");
        System.out.println("Subtotal: $" + formattedSubtotal);
       // System.out.println("Sales Tax (8%): $" + formattedSalesTax);
        System.out.println("Total Sale: $" + formattedTotalSale);
    }
}







