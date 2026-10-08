
import java.util.Scanner;

public class MulitplyTable{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a Number = ");
        int number = input.nextInt();

        System.out.println("Multiplication of number " + number);

        for ( int i = 1; i <= 10; i++){
            System.out.println( number + " x " + i + " = " + (number * i));  
        }
        input.close();
    }
}