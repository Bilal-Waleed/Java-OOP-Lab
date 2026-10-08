import java.util.Scanner;

class MobilePlan {

    String userName;
    double monthlyLimit;
    double[] dailyUsage;

    // Parameterized Constructor
    MobilePlan(String userName, double monthlyLimit, double[] dailyUsage) {

        this.userName = userName;
        this.monthlyLimit = monthlyLimit;
        this.dailyUsage = dailyUsage;
    }

    // Calculate total data used
    double calculateTotalUsage() {

        double total = 0;

        for (int i = 0; i < dailyUsage.length; i++) {
            total = total + dailyUsage[i];
        }

        return total;
    }

    // Calculate remaining data
    double calculateRemainingData() {

        return monthlyLimit - calculateTotalUsage();
    }

    // Count days where usage exceeded 2 GB
    int countExceededDays() {

        int count = 0;

        for (int i = 0; i < dailyUsage.length; i++) {

            if (dailyUsage[i] > 2) {
                count++;
            }
        }

        return count;
    }

    // Display complete information
    void displayInfo() {

        double totalUsage = calculateTotalUsage();
        double remainingData = calculateRemainingData();

        System.out.println("\n===== MOBILE PLAN DETAILS =====");

        System.out.println("User Name: " + userName);
        System.out.println("Monthly Data Limit: " + monthlyLimit + " GB");

        System.out.println("\nDaily Usage:");

        for (int i = 0; i < dailyUsage.length; i++) {
            System.out.println("Day " + (i + 1) + ": "
                    + dailyUsage[i] + " GB");
        }

        System.out.println("\nTotal Data Used: " + totalUsage + " GB");

        if (remainingData >= 0) {
            System.out.println("Remaining Data: "
                    + remainingData + " GB");
        } else {
            System.out.println("Data Exceeded By: "
                    + (-remainingData) + " GB");
        }

        System.out.println("Days Usage Exceeded 2 GB: "
                + countExceededDays());

        // Warning
        if (totalUsage > monthlyLimit) {
            System.out.println("WARNING: Monthly data limit exceeded!");
        } else {
            System.out.println("Data usage is within the monthly limit.");
        }
    }
}

public class MobileDataMonitor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter user name: ");
        String name = input.nextLine();

        System.out.print("Enter monthly data limit (GB): ");
        double limit = input.nextDouble();

        double[] usage = new double[7];

        // Taking daily usage
        for (int i = 0; i < usage.length; i++) {

            System.out.print("Enter data usage for Day "
                    + (i + 1) + " (GB): ");

            usage[i] = input.nextDouble();
        }

        // Creating object using parameterized constructor
        MobilePlan plan = new MobilePlan(name, limit, usage);

        // Display information
        plan.displayInfo();

        input.close();
    }
}