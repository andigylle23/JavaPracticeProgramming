package bookExampleMediumCode;

import java.util.Map;
import java.util.Scanner;

public class Answer {
    // Declaration
    // Registration of book class instantiation
    RegisterBook bookRegister = new RegisterBook();
    // Search for a book class instantiation
    SearchBook searchBook = new SearchBook();
    // Message display class instantiation
    ChoiceMessage choiceMessage = new ChoiceMessage();

    // For user input choices and put it in map
    protected void userInput(Scanner scanner, Map<String, String> registeredBooks) {
        // Accept user input
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            // Register a book
            case "r":
                bookRegister.registerBook(scanner, registeredBooks);
                // Display again the choices
                choiceMessage.displayMessage();
                break;
            // Search for a book
            case "s":
                searchBook.searchForABook(scanner, registeredBooks);
                // Display again the choices
                choiceMessage.displayMessage();
                break;
            // Quit the system
            case "q":
                System.exit(0);
                break;
            // If the choices is not in the selection
            default:
                System.out.println("The inputted choice is not in our list. Please try again");
                // Display again the choices
                choiceMessage.displayMessage();
        }
    }
}
