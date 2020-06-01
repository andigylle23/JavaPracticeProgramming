package bookExampleBeginnerCode;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class BookBeginnerCode {

    public static void main(String[] args) {
        // Declaration
        Map<String, String> registeredBooks = new ConcurrentHashMap<>();
        Scanner scanner = new Scanner(System.in);
        // Get the message
        banner();

        // Loop the user input until it doesn't have any
        while(scanner.hasNextLine()) {
            answer(scanner, registeredBooks);
        }
    }

    // First message that you see when the program start
    public static void banner() {
        System.out.println("Do you want to register a book or search");
        System.out.println("[r] Register\n[s] Search\n[q] Quit");
        System.out.print("Enter your choice: ");
    }

    // Where the choices happen and store it on map
    public static void answer(Scanner scanner,  Map<String, String> registeredBooks) {
        // Assign the user input into string variable
        String answer = scanner.nextLine();

        // Choices
        if(answer.contains("r")) {
            // Register a book
            registerBook(scanner, registeredBooks);
            // Call the banner again
            banner();
        } else if(answer.contains("s")) {
            // Search for a book
            searchBook(scanner, registeredBooks);
            // Call the banner again
            banner();
        } else if(answer.contains("q")) {
            // Quit the program
            System.exit(0);
        } else {
            // If user input is not in the choices presented
            System.out.println("The inputted choice is not in our list. Please try again");
            // Call the banner again
            banner();
        }
    }

    // Register the book by getting user input and store it on the map
    public static Map<String, String> registerBook(Scanner scanner, Map<String, String> registeredBooks) {
        System.out.println("You choose to register a book");
        System.out.print("Enter the book name: ");
        // Assign the user input for book name into string variable
        String bookName = scanner.nextLine();
        System.out.print("Enter the book code: ");
        // Assign the user input for book code into string variable
        String bookNo = scanner.nextLine();

        // Add the book name and code to the map
        registeredBooks.put(bookName, bookNo);
        System.out.println("Successfully registered a book!");

        // Return the map
        return registeredBooks;
    }

    // Search for a book with the existing user input
    public static void searchBook(Scanner scanner, Map<String, String> registeredBooks) {
        System.out.println("You choose to search for a book.");
        System.out.print("Please input a keyword: ");
        String keyword = scanner.nextLine();

        // Search in the map for the keyword that the user inputted
        if(registeredBooks.containsKey(keyword)) {
            System.out.println("The book " + keyword + " is found in the library.");
        } else {
            System.out.println("We couldn't find the book that you are looking for");
        }

    }
}
