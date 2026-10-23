
class FoodDeliveryOrder {
    private String itemName;
    private int quantity;
    private double price;
    private String orderStatus;

    // Constructor
    public FoodDeliveryOrder(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.orderStatus = "Pending";

        setQuantity(quantity);
        setPrice(price);
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    // Setters with validation
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    // Calculate total amount
    public double calculateTotal() {
        return quantity * price;
    }

    // Change order status through valid operations
    public void confirmOrder() {
        if (orderStatus.equals("Pending")) {
            orderStatus = "Confirmed";
            System.out.println("Order confirmed.");
        } else {
            System.out.println("Order cannot be confirmed.");
        }
    }

    public void markAsDelivered() {
        if (orderStatus.equals("Confirmed")) {
            orderStatus = "Delivered";
            System.out.println("Order delivered.");
        } else {
            System.out.println("Order must be confirmed first.");
        }
    }

    public void cancelOrder() {
        if (orderStatus.equals("Pending")
                || orderStatus.equals("Confirmed")) {
            orderStatus = "Cancelled";
            System.out.println("Order cancelled.");
        } else {
            System.out.println("Order cannot be cancelled.");
        }
    }

    // Display order details
    public void displayOrder() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: " + price);
        System.out.println("Total Amount: " + calculateTotal());
        System.out.println("Order Status: " + orderStatus);
        System.out.println("--------------------------");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        FoodDeliveryOrder order1 =
                new FoodDeliveryOrder("Burger", 2, 500);

        FoodDeliveryOrder order2 =
                new FoodDeliveryOrder("Pizza", 1, 1200);

        System.out.println("First Order:");
        order1.displayOrder();

        order1.confirmOrder();
        order1.markAsDelivered();
        order1.displayOrder();

        System.out.println("Second Order:");
        order2.displayOrder();

        order2.setQuantity(3);
        order2.setPrice(-100);
        order2.displayOrder();

        order2.cancelOrder();
        order2.displayOrder();

        System.out.println("Testing Invalid Quantity:");
        order1.setQuantity(0);
        order1.displayOrder();

        System.out.println("Testing Invalid Status Operation:");
        order2.markAsDelivered();
    }
}
