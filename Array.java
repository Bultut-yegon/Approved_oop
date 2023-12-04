import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 40 numbers
        int[] numbers = new int[40];

        // Get the numbers from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average of the numbers
        double average = (double) sum / numbers.length;

        // Print the numbers, sum, and average
        System.out.println("Numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
    }
    
}
