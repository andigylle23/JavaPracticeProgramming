package firstBaseProgramming.bookExampleMediumCode;

import java.util.Map;
import java.util.Scanner;

public class SearchBook {

    // Search a book using user input and search in the existing data in hashmap
    protected void searchForABook(Scanner scanner, Map<String, String> registeredBooks) {
        // Display message
        System.out.println("You choose to search for a book.");
        System.out.print("Please input a keyword: ");
        // Store the input user keyword
        String keyword = scanner.nextLine();

        // Search in the existing hashmap the keyword that the user inputted
        if(registeredBooks.containsKey(keyword)) {
            // If found: return a simple message that the book is found using the keyword
            System.out.println("The book '" + keyword + "' is found in the library!");
        } else {
            // Display a message that book (keyword) is not found
            System.out.println("Sorry we couldn't found what you are looking for.");
        }

    }
}
