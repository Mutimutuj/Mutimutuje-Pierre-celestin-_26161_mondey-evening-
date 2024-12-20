package ExceptionHandlings;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

public class EOFExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file name (for EOFException test):");
        String fileName = scanner.nextLine();

        try (DataInputStream input = new DataInputStream(new FileInputStream(fileName))) {
            // Trying to read beyond the file's end
            while (true) {
                input.readByte(); // This will trigger EOFException when end of file is reached
            }
        } catch (EOFException e) {
            // Handling EOFException when we try to read past the end of the file
            System.out.println("EOFException: Reached the end of the file unexpectedly.");
        } catch (IOException e) {
            // Catching any other I/O related exceptions
            System.out.println("IOException: An I/O error occurred.");
        }
    }
}
