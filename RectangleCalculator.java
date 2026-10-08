import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter Length: ");
        double length = input.nextDouble();

        System.out.print("Enter Width: ");
        double width = input.nextDouble();

        // Calculations
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Output
        System.out.println("\n==================================");
        System.out.println("Rectangle Calculator");
        System.out.println("==================================");
        System.out.println("Length     : " + length);
        System.out.println("Width      : " + width);
        System.out.println("Area       : " + area);
        System.out.println("Perimeter  : " + perimeter);
    }
}