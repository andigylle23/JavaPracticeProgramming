package firstBaseProgramming.bookExampleMediumCodeEncapsulation.items;

import java.util.Scanner;

public class BookImplementation implements IItems {

    @Override
    public void register(Scanner scanner, Items items) {
        // Display Message
        System.out.println("You choose to register a book");
        System.out.print("Enter the book name: ");
        // Store the user input of book name
        String bookName = scanner.nextLine();
        items.setItemName(bookName);

        System.out.print("Enter the book number: ");
        // Store the user input of the book number
        String bookNo = scanner.nextLine();
        items.setItemNo(bookNo);

        // Display a simple message that the book is registered
        System.out.println("You have successfully registered the book.");

    }

    @Override
    public void searchForItem(Scanner scanner, Items items) {
        // Display the message
        System.out.println("You choose to search for a book.");
        System.out.print("Please input a keyword: ");
        // Store the keyword that the user inputted
        String keyword = scanner.nextLine();

        if(keyword == null) {
            return;
        }

        if(items.getItemNo().contains(keyword) || items.getItemName().contains(keyword)) {
            System.out.println("The book '" + keyword + "' is found in the library!");
        } else {
            // If not: display that it is not found
            System.out.println("Sorry we couldn't found what you are looking for.");
        }

    }

    @Override
    public void display() {
        // Display message for books registration or search
        System.out.println("Do you want to register a book or search");
        System.out.println("[r] Register\n[s] Search\n[q] Quit");
        System.out.print("Enter your choice: ");
    }

    @Override
    public void choice(Scanner scanner, Items items) {
        // Store the user input
        String userChoice = scanner.nextLine();

        // User input
        switch (userChoice) {
            case "r":
                // Register a book
                register(scanner, items);
                // Display the main message
                display();
                break;
            case "s":
                // Search for a book
                searchForItem(scanner, items);
                // Display the main message
                display();
                break;
            case "q":
                // Quit the program
                System.exit(0);
                break;
            default:
                // If the user input is not in the choices
                System.out.println("The inputted choice is not in our list. Please try again");
                display();
        }
    }
}
