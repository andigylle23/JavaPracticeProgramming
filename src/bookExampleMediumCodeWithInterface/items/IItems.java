package bookExampleMediumCodeWithInterface.items;

import java.util.Map;
import java.util.Scanner;

// Empty model for the Items
public interface IItems {
    // Registration of items
    Map<String, String> registerItems(Scanner scanner, Map<String, String> registeredItems);
    // Search for existing items
    void searchItems(Scanner scanner, Map<String, String> registeredItems);
    // Display any message
    void displayMessage();
    // Accept user input
    void userInput(Scanner scanner, Map<String, String> registeredBooks);

}
