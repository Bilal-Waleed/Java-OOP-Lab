import java.util.Scanner;

public class StudentResultCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Programming Marks: ");
        double programming = input.nextDouble();

        System.out.print("Enter Mathematics Marks: ");
        double mathematics = input.nextDouble();

        System.out.print("Enter English Marks: ");
        double english = input.nextDouble();

        // Calculations
        double total = programming + mathematics + english;
        double percentage = (total / 300) * 100;

        // Output
        System.out.println("\n==================================");
        System.out.println("UBIT - University of Karachi");
        System.out.println("Student Result");
        System.out.println("==================================");
        System.out.println("Student Name : " + name);
        System.out.println("Student ID   : " + id);
        System.out.println("Programming  : " + programming);
        System.out.println("Mathematics  : " + mathematics);
        System.out.println("English      : " + english);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage + "%");
    }
}