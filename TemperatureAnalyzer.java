import java.util.Scanner;

public class TemperatureAnalyzer {

    static double calculateAverage(int[] temperatures) {
        int sum = 0;

        for (int i = 0; i < temperatures.length; i++) {
            sum = sum + temperatures[i];
        }

        return (double) sum / temperatures.length;
    }

    static int findHighest(int[] temperatures) {
        int highest = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
        }

        return highest;
    }

    static int findLowest(int[] temperatures) {
        int lowest = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }

        return lowest;
    }

    static int countHotDays(int[] temperatures) {
        int count = 0;

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > 35) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] temperatures = new int[7];

        // Taking input
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter temperature for Day " + (i + 1) + ": ");
            temperatures[i] = input.nextInt();
        }

        // Display temperatures
        System.out.println("\nTemperatures:");

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i] + "°C");
        }

        // Display results
        System.out.println("\nAverage Temperature: "
                + calculateAverage(temperatures) + "°C");

        System.out.println("Highest Temperature: "
                + findHighest(temperatures) + "°C");

        System.out.println("Lowest Temperature: "
                + findLowest(temperatures) + "°C");

        System.out.println("Number of Hot Days: "
                + countHotDays(temperatures));

        input.close();
    }
}