package bookExampleMediumCodeWithInterface.itemsImplemantation;

import bookExampleMediumCodeWithInterface.items.IItems;

import java.util.Map;
import java.util.Scanner;

// Concrete class for Movie and implement the IItems items
public class MovieImpl implements IItems {

    // Register movie items
    @Override
    public Map<String, String> registerItems(Scanner scanner, Map<String, String> registeredItems) {
        System.out.println("You choose to register a movie");
        System.out.print("Enter the movie name: ");
        // Store the user input for movie name
        String movieName = scanner.nextLine();

        System.out.print("Enter the movie code: ");
        // Store the user input for movie number
        String movieNo = scanner.nextLine();

        // Then add the user inputs in the hashmap
        registeredItems.put(movieName, movieNo);
        // Display a simple message that the movie item is registered
        System.out.println("You have successfully registered the movie.");

        // Return the registeredItems
        return registeredItems;
    }

    // Override the searchItems in IItems class
    @Override
    public void searchItems(Scanner scanner, Map<String, String> registeredItems) {
        // Display message
        System.out.println("You choose to search for a movie.");
        System.out.print("Please input a keyword: ");
        // Store the user input keyword
        String keyword = scanner.nextLine();

        // Search in the existing hashmap using the user input keyword
        if(registeredItems.containsKey(keyword)) {
            // If found: then return a simple message that it is found
            System.out.println("The movie '" + keyword + "' is found in the movie history!");
        } else {
            // If not found: then return a message that it is not found
            System.out.println("Sorry we couldn't found what you are looking for.");
        }
    }


    // Override the displayMessage into movie registration or search
    @Override
    public void displayMessage() {
        System.out.println("Do you want to register a movie or search");
        System.out.println("[r] Register\n[s] Search\n[q] Quit");
        System.out.print("Enter your choice: ");
    }

    // Override the user input from IItems class
    @Override
    public void userInput(Scanner scanner, Map<String, String> registerItems) {
        // Store the user input
        String userChoice = scanner.nextLine();

        // Condition for the user input in the choices
        switch (userChoice) {
            case "r":
                // Register movie items
                registerItems(scanner, registerItems);
                // Display the main message
                displayMessage();
                break;
            case "s":
                // Search movie items
                searchItems(scanner, registerItems);
                // Display the main message
                displayMessage();
                break;
            case "q":
                // Quit the program
                System.exit(0);
                break;
            default:
                // Display the default message when the user input a choice that is not in the list
                System.out.println("The inputted choice is not in our list. Please try again");
                // Display the main message
                displayMessage();
        }
    }
}
