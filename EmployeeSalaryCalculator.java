import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Employee ID: ");
        String id = input.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        // Calculations
        double houseRent = basicSalary * 0.20;
        double medicalAllowance = basicSalary * 0.10;
        double grossSalary = basicSalary + houseRent + medicalAllowance;

        // Output
        System.out.println("\n==================================");
        System.out.println("Employee Salary Record");
        System.out.println("==================================");
        System.out.println("Employee Name      : " + name);
        System.out.println("Employee ID        : " + id);
        System.out.println("Basic Salary       : " + basicSalary);
        System.out.println("House Rent (20%)   : " + houseRent);
        System.out.println("Medical (10%)      : " + medicalAllowance);
        System.out.println("Gross Salary       : " + grossSalary);
    }
}