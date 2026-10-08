import java.util.Scanner;

public class Task3RepeatedInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        do {
            System.out.print("Enter a number (Enter 0 to stop): ");
            number = input.nextInt();

        } while (number != 0);

        System.out.println("Program stopped because you entered 0.");

        input.close();
    }
}