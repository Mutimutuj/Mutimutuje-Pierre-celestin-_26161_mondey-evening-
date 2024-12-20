package ExceptionHandlings;
import java.util.Scanner;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a class name to load (for ClassNotFoundException test):");
        String className = scanner.nextLine();

        try {
            // Trying to load a class that doesn't exist
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            // Handling ClassNotFoundException
            System.out.println("ClassNotFoundException: The specified class was not found.");
        }
    }
}
