import java.util.Scanner;

public class ParkingLot {

    static int[] spaces = new int[12];

    static void parkVehicle(int space) {

        if (space < 1 || space > 12) {
            System.out.println("Invalid parking space!");
            return;
        }

        if (spaces[space - 1] == 1) {
            System.out.println("Parking space is already occupied.");
        } else {
            spaces[space - 1] = 1;
            System.out.println("Vehicle parked successfully.");
        }
    }

    static void removeVehicle(int space) {

        if (space < 1 || space > 12) {
            System.out.println("Invalid parking space!");
            return;
        }

        if (spaces[space - 1] == 0) {
            System.out.println("Parking space is already available.");
        } else {
            spaces[space - 1] = 0;
            System.out.println("Vehicle removed successfully.");
        }
    }

    static void displayStatus() {

        System.out.println("\nParking Lot Status:");

        for (int i = 0; i < spaces.length; i++) {

            if (spaces[i] == 0) {
                System.out.println("Space " + (i + 1) + ": Available");
            } else {
                System.out.println("Space " + (i + 1) + ": Occupied");
            }
        }
    }

    static int countAvailableSpaces() {

        int count = 0;

        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initially occupied spaces
        spaces[0] = 1;
        spaces[3] = 1;
        spaces[5] = 1;
        spaces[8] = 1;

        int choice;

        do {

            System.out.println("\n===== PARKING LOT MANAGEMENT =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Display Status");
            System.out.println("4. Count Available Spaces");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter parking space number (1-12): ");
                    int parkSpace = input.nextInt();
                    parkVehicle(parkSpace);
                    break;

                case 2:
                    System.out.print("Enter parking space number (1-12): ");
                    int removeSpace = input.nextInt();
                    removeVehicle(removeSpace);
                    break;

                case 3:
                    displayStatus();
                    break;

                case 4:
                    System.out.println("Available Spaces: "
                            + countAvailableSpaces());
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        input.close();
    }
}