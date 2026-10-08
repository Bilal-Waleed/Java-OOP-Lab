import java.util.Scanner;

public class Task2SumOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);

        input.close();
    }
}