package bookExampleMediumCode;

import java.util.Map;
import java.util.Scanner;

public class RegisterBook {

    // Register a book using hashmap and from user input
    protected Map<String, String> registerBook(Scanner scanner, Map<String, String> registeredBooks) {

        // Display message: User input of the book
        System.out.println("You choose to register a book");
        System.out.print("Enter the book name: ");
        // Accept the user input of the book name
        String bookName = scanner.nextLine();

        System.out.print("Enter the book number: ");
        // Accept the user input of the book number
        String bookNo = scanner.nextLine();

        // Add the user input into the hashmap
        registeredBooks.put(bookName, bookNo);
        // Simple message that the book is already added in the hashmap
        System.out.println("You have successfully registered the book.");

        // return the hashmap
        return registeredBooks;
    }
}
