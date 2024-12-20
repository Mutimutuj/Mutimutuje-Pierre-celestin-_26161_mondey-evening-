package ExceptionHandlings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class IOExceptionExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the file name that you want to read (for IOException test):");
        String fileName = scanner.nextLine();

        try {

            // Trying to open a file that may not exist
            FileReader reader=new FileReader(fileName);
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {

            // Catching IOException when file cannot be read
            System.out.println("The file that you want to access does not exist!!");
        }
    }
}
