import java.util.Scanner;

class Product {
    String productName;
    double price;
    int quantity;

    // Method to calculate total price
    double calculateTotalPrice() {
        return price * quantity;
    }

    // Method to apply discount
    double applyDiscount() {

        double total = calculateTotalPrice();
        double discount;

        if (total >= 10000) {
            discount = total * 0.20;
        } 
        else if (total >= 5000) {
            discount = total * 0.10;
        } 
        else {
            discount = 0;
        }

        return total - discount;
    }

    // Method to calculate discount amount
    double calculateDiscount() {

        double total = calculateTotalPrice();

        if (total >= 10000) {
            return total * 0.20;
        } 
        else if (total >= 5000) {
            return total * 0.10;
        } 
        else {
            return 0;
        }
    }

    // Method to display product details
    void displayProductDetails() {

        double total = calculateTotalPrice();
        double discount = calculateDiscount();
        double finalAmount = applyDiscount();

        System.out.println("\n--- Product Details ---");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Payable Amount: " + finalAmount);
    }
}

public class OnlineShoppingCart {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Enter Product Name: ");
        product.productName = input.nextLine();

        System.out.print("Enter Product Price: ");
        product.price = input.nextDouble();

        System.out.print("Enter Quantity: ");
        product.quantity = input.nextInt();

        product.displayProductDetails();

        input.close();
    }
}