import java.util.Scanner;

public class SumNumber{
    public static void main( String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a postive integer = ");
        int n = input.nextInt();
        int sum = 0;

        for( int i = 0 ; i<= n ; i++){
            sum = sum + i;
        }
        System.out.println("Sum of Number 1 to " + n + " = " + sum);
        input.close();
    }
} 