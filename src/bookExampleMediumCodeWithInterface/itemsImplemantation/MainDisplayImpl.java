package bookExampleMediumCodeWithInterface.itemsImplemantation;

import bookExampleMediumCodeWithInterface.items.IMainDisplay;

import java.util.Map;
import java.util.Scanner;

public class MainDisplayImpl implements IMainDisplay {

    BooksImpl books = new BooksImpl();
    MovieImpl movie = new MovieImpl();

    @Override
    public void display() {
        System.out.println("Do you want to check for books or movies");
        System.out.println("[b] Books\n[m] Movies\n[q] Quit");
        System.out.print("Enter your choice: ");
    }

    @Override
    public void userInput(Scanner scanner) {
        // Store the user input
        String userChoice = scanner.nextLine();

        // Condition for the user input in the choices
        switch (userChoice) {
            case "b":
                // Display the main message
                books.displayMessage();
                break;
            case "s":
                // Display the main message
                movie.displayMessage();
                break;
            case "q":
                // Quit the program
                System.exit(0);
                break;
            default:
                // Display the default message when the user input a choice that is not in the list
                System.out.println("The inputted choice is not in our list. Please try again");
                // Display the main message
                display();
        }
    }
}
