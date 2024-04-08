package Practical;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ReadIntegerFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}
