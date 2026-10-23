
class ParkingVehicle {
    private String vehicleNumber;
    private int parkingHours;
    private double parkingFee;
    private boolean paid;

    // Constructor
    public ParkingVehicle(String vehicleNumber, int parkingHours) {
        if (vehicleNumber == null || vehicleNumber.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Vehicle number cannot be empty."
            );
        }

        if (parkingHours <= 0) {
            throw new IllegalArgumentException(
                    "Parking hours must be positive."
            );
        }

        this.vehicleNumber = vehicleNumber;
        this.parkingHours = parkingHours;
        this.parkingFee = calculateParkingFee();
        this.paid = false;
    }

    // Getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getParkingHours() {
        return parkingHours;
    }

    public double getParkingFee() {
        return parkingFee;
    }

    public boolean isPaid() {
        return paid;
    }

    // Calculate fee: Rs. 100 per hour
    public double calculateParkingFee() {
        return parkingHours * 100.0;
    }

    // Process payment
    public void makePayment(double amount) {
        if (paid) {
            System.out.println("Payment already completed.");
        } else if (amount <= 0) {
            System.out.println("Invalid payment amount.");
        } else if (amount < parkingFee) {
            System.out.println("Insufficient payment.");
        } else {
            paid = true;

            System.out.println("Payment successful.");
            System.out.println(
                    "Change: Rs. " + (amount - parkingFee)
            );
        }
    }

    // Display parking details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Parking Fee: Rs. " + parkingFee);
        System.out.println("Payment Status: "
                + (paid ? "Paid" : "Unpaid"));
        System.out.println("--------------------------");
    }
}

public class SmartParkingPayment {
    public static void main(String[] args) {

        ParkingVehicle vehicle1 =
                new ParkingVehicle("ABC-123", 2);

        ParkingVehicle vehicle2 =
                new ParkingVehicle("XYZ-456", 5);

        ParkingVehicle vehicle3 =
                new ParkingVehicle("KHI-789", 3);

        System.out.println("Vehicle 1 Details:");
        vehicle1.displayDetails();
        vehicle1.makePayment(200);
        vehicle1.displayDetails();

        System.out.println("Vehicle 2 Details:");
        vehicle2.displayDetails();
        vehicle2.makePayment(300);
        vehicle2.makePayment(500);
        vehicle2.displayDetails();

        System.out.println("Vehicle 3 Details:");
        vehicle3.displayDetails();
        vehicle3.makePayment(-50);
        vehicle3.makePayment(400);
        vehicle3.displayDetails();
    }
}
