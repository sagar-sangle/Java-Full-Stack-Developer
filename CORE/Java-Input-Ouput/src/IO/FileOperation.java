package IO;

import java.io.*;
import java.util.Scanner;

public class FileOperation {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Creating a file
        File file = new File("src/demo.txt"); // Creates if it does not exist
        boolean isCreated;
        try {
            isCreated = file.createNewFile();
            if (isCreated) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            return;
        }


        // Writing to the file
        try (FileWriter fout = new FileWriter(file)) {
            System.out.println("Enter the text to enter into the file: ");
            String content = sc.nextLine(); // Using nextLine() to capture full input
            fout.write(content);
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from file using FileInputStream
        try (FileInputStream fin = new FileInputStream(file)) {
            System.out.println("\nFile size (bytes): " + fin.available()); // Size of the file

            // Reading first byte and printing as char
            int firstByte = fin.read();
            int secondbyte = fin.read();
            if (firstByte != -1) {
                System.out.println("First character in file: " + (char) firstByte);
            }

            // Reading entire content
            System.out.println("\nReading full file content:");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i); // Print characters one by one
            }





        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }




        sc.close(); // Close scanner
    }
}
