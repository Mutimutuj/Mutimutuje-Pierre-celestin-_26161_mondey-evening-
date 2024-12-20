package ExceptionHandlings;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class ExceptionHandlingExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an exception to demonstrate:");
        System.out.println("1. IOException\n2. FileNotFoundException\n3. EOFException\n4. SQLException\n" +
                "5. ClassNotFoundException\n6. ArithmeticException\n7. NullPointerException\n" +
                "8. ArrayIndexOutOfBoundsException\n9. ClassCastException\n10. IllegalArgumentException\n" +
                "11. NumberFormatException");
        int choice = scanner.nextInt();

        // As I have used one program to Handle different exceptions I've Used a Switch case to choose any of them.
        switch (choice) {
            case 1 -> demonstrateIOException();
            case 2 -> demonstrateFileNotFoundException();
            case 3 -> demonstrateEOFException();
            case 4 -> demonstrateSQLException();
            case 5 -> demonstrateClassNotFoundException();
            case 6 -> demonstrateArithmeticException();
            case 7 -> demonstrateNullPointerException();
            case 8 -> demonstrateArrayIndexOutOfBoundsException();
            case 9 -> demonstrateClassCastException();
            case 10 -> demonstrateIllegalArgumentException();
            case 11 -> demonstrateNumberFormatException();
            default -> System.out.println("Invalid choice.");
        }
    }
// All Exceptions were declared as methods
    
    // IOException: Happens when there's an error during input or output operations
    public static void demonstrateIOException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file path to read:");
        String filePath = scanner.nextLine();
        try {
            // Tries to read the file at the given path
            FileReader reader = new FileReader(filePath);
        } catch (IOException e) {
            // Handles the error if the file cannot be read
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    // FileNotFoundException: We use this when a file is not found
    public static void demonstrateFileNotFoundException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file path to open:");
        String filePath = scanner.nextLine();
        try {

            FileInputStream file = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {

            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }

    // EOFException: We use this when trying to read at the end of a file
    public static void demonstrateEOFException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file path to read as binary data:");
        String filePath = scanner.nextLine();
        try (DataInputStream input = new DataInputStream(new FileInputStream(filePath))) {
            // Tries to read a byte from the file
            System.out.println("Reading a byte: " + input.readByte());
        } catch (EOFException e) {
            // Handles the error if the end of the file is reached
            System.out.println("Caught EOFException: End of file reached unexpectedly.");
        } catch (IOException e) {
            // Handles other IO errors
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    // SQLException: Happens during database access errors
    public static void demonstrateSQLException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a database URL:");
        String dbUrl = scanner.nextLine();
        try {
            // Tries to connect to the database
            Connection connection = DriverManager.getConnection(dbUrl, "user", "password");
        } catch (SQLException e) {
            // Handles the error if the connection fails
            System.out.println("Caught SQLException: " + e.getMessage());
        }
    }

    // ClassNotFoundException: Happens when a class is not found
    public static void demonstrateClassNotFoundException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a class name to load:");
        String className = scanner.nextLine();
        try {
            // Tries to load the specified class
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            // Handles the error if the class is not found
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }

    // ArithmeticException: Happens during invalid math operations
    public static void demonstrateArithmeticException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numerator and denominator:");
        try {
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();
            // Tries to divide the numbers
            System.out.println("Result: " + (numerator / denominator));
        } catch (ArithmeticException e) {
            // Handles the error if dividing by zero
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        }
    }

    // NullPointerException: Happens when trying to access something that is null
    public static void demonstrateNullPointerException() {
        System.out.println("Trying to access a null object.");
        String str = null;
        try {
            // Tries to find the length of the null string
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // Handles the error if the object is null
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    // ArrayIndexOutOfBoundsException: Happens when accessing an invalid index in an array
    public static void demonstrateArrayIndexOutOfBoundsException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index to access in an array of size 3:");
        int[] arr = {1, 2, 3};
        try {
            int index = scanner.nextInt();
            // Tries to access the array at the given index
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles the error if the index is invalid
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // ClassCastException: Happens when trying to cast an object incorrectly
    public static void demonstrateClassCastException() {
        System.out.println("Trying to cast an object incorrectly.");
        try {
            Object obj = 42;
            // Tries to cast an integer to a string (invalid)
            String str = (String) obj;
        } catch (ClassCastException e) {
            // Handles the error if the cast is invalid
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }

    // IllegalArgumentException: Happens when passing an invalid argument to a method
    public static void demonstrateIllegalArgumentException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a negative number:");
        int age = scanner.nextInt();

        try {
            // Checks if the number is invalid (negative)
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
            System.out.println("Age is valid.");
        } catch (IllegalArgumentException e) {
            // Handles the error if the number is negative
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    // NumberFormatException: Happens when trying to parse an invalid number
    public static void demonstrateNumberFormatException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-numeric string to parse as a number:");
        String input = scanner.nextLine();
        try {
            // Tries to convert the string into an integer
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Handles the error if the string is not a number
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}
