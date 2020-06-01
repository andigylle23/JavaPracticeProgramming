package bookExampleMediumCodeWithInterface.itemsImplemantation;

import bookExampleMediumCodeWithInterface.items.IItems;

import java.util.Map;
import java.util.Scanner;

// Concrete class to implement the Items interface class
public class BooksImpl implements IItems {

    // Override the registerItems in IItems class
    @Override
    public Map<String, String> registerItems(Scanner scanner, Map<String, String> registeredItems) {
        // Display Message
        System.out.println("You choose to register a book");
        System.out.print("Enter the book name: ");
        // Store the user input of book name
        String bookName = scanner.nextLine();

        System.out.print("Enter the book number: ");
        // Store the user input of the book number
        String bookNo = scanner.nextLine();

        // Then add the user inputted data on hashmap
        registeredItems.put(bookName, bookNo);
        // Display a simple message that the book is registered
        System.out.println("You have successfully registered the book.");

        // Return the hashmap
        return registeredItems;
    }

    // Override the searchItems in IItems class
    @Override
    public void searchItems(Scanner scanner, Map<String, String> registeredItems) {
        // Display the message
        System.out.println("You choose to search for a book.");
        System.out.print("Please input a keyword: ");
        // Store the keyword that the user inputted
        String keyword = scanner.nextLine();

        // Search in the existing hashmap the keyword that the user inputted
        if(registeredItems.containsKey(keyword)) {
            // If found: display a simple message that the book(keyword) is found
            System.out.println("The book '" + keyword + "' is found in the library!");
        } else {
            // If not: display that it is not found
            System.out.println("Sorry we couldn't found what you are looking for.");
        }
    }

    // Override the displayMessage in IItems class
    @Override
    public void displayMessage() {
        // Display message for books registration or search
        System.out.println("Do you want to register a book or search");
        System.out.println("[r] Register\n[s] Search\n[q] Quit");
        System.out.print("Enter your choice: ");
    }

    // Override the userInput in IItems class
    @Override
    public void userInput(Scanner scanner, Map<String, String> registerItems) {
        // Store the user input
        String userChoice = scanner.nextLine();

        // User input
        switch (userChoice) {
            case "r":
                // Register a book
                registerItems(scanner, registerItems);
                // Display the main message
                displayMessage();
                break;
            case "s":
                // Search for a book
                searchItems(scanner, registerItems);
                // Display the main message
                displayMessage();
                break;
            case "q":
                // Quit the program
                System.exit(0);
                break;
            default:
                // If the user input is not in the choices
                System.out.println("The inputted choice is not in our list. Please try again");
                displayMessage();
        }
    }
}
