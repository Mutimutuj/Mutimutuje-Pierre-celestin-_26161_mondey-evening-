package ExceptionHandlings;

import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-numeric string (for NumberFormatException test):");
        String input = scanner.nextLine();

        try {
            // Trying to parse a non-numeric string as an integer
            int number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // Handling NumberFormatException when input is not a valid integer
            System.out.println("NumberFormatException: Invalid format for parsing the number.");
        }
    }
}
