package ExceptionHandlings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name to open (for FileNotFoundException test):");
        String fileName = scanner.nextLine();

        try {
            // Trying to open a non-existent file
            FileInputStream file= new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            // Handling the case where file is not found
            System.out.println("FileNotFoundException: The specified file was not found.");
        }
    }
}
