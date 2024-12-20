package ExceptionHandlings;

import java.util.Scanner;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string (for NullPointerException test):");
        String str = scanner.nextLine();

        try {
            // Accessing method length() on a null object will cause NullPointerException
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("NullPointerException: Cannot access methods on a null reference.");
        }
    }
}

