import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the price of the item
        System.out.print("Enter the price of the item: ");
        double itemPrice = scanner.nextDouble();

        // Calculate shipping cost
        double shippingCost;
        if (itemPrice >= 100) {
            shippingCost = 0;
        } else {
            shippingCost = itemPrice * 0.02;
        }

        // Calculate total price
        double totalPrice = itemPrice + shippingCost;

        // Output the shipping cost and total price
        System.out.printf("Shipping cost: $%.2f%n", shippingCost);
        System.out.printf("Total price: $%.2f%n", totalPrice);

        scanner.close();
    }
}
