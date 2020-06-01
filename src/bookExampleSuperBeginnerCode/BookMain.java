package bookExampleSuperBeginnerCode;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class BookMain {
    public static void main(String[] args) {
        // Declaration
        Scanner scanner;
        Map<String, String> registerBook = new ConcurrentHashMap<>();
        String bookName;
        String bookNo;

        System.out.println("Do you want to register a book?");
        System.out.print("Please input yes or no: ");
        // assign the scanner into new
        scanner = new Scanner(System.in);

        // Assign the accepted input of user into string
        String answer = scanner.nextLine();

        // loop statements but very bad
        if(answer.contains("yes")) {

            // Ask the user to input book name and number
            System.out.println("Input book name: ");
            // Assigned the user input to variable
            bookNo = scanner.nextLine();
            System.out.println("Input book number: ");
            // Assigned the user input to variable
            bookName = scanner.nextLine();

            // add the book name and book number
            registerBook.put(bookNo, bookName);
            System.out.println("Successfully registered!");

            // Print out again if the user wants to register a book
            System.out.println("Do you want to register a book?");
            System.out.print("Please input yes or no: ");
            answer = scanner.nextLine();

            if(answer.contains("yes")) {
                System.out.println("Input book name: ");
                bookNo = scanner.nextLine();
                System.out.println("Input book number: ");
                bookName = scanner.nextLine();

                registerBook.put(bookNo, bookName);

                System.out.println("Successfully registered!");
                System.out.println("Do you want to register a book?");
                System.out.print("Please input yes or no: ");
                answer = scanner.nextLine();

            } else if(answer.contains("no")) {

                // Ask user if wants to search a book
                System.out.println("Do you want to search for a book?");
                System.out.print("Please input yes or no: ");
                // Assign the user input into a new string variable
                String searchAnswer = scanner.nextLine();
                if(searchAnswer.contains("yes")) {
                    // Ask the user to input the name of the book
                    System.out.println("Please input the name of the book: ");
                    // Assign the user input into a new string variable
                    String searchKey = scanner.nextLine();

                    // If the searchKey will be found
                    if(registerBook.containsKey(searchKey)) {
                        // Display that it was found in the library
                        System.out.println("Found the book " + searchKey);
                    } else {
                        // Display that is not a available
                        System.out.println("It seems that the book is not available.");
                    }
                // If the user answer is no about the search
                } else if(searchAnswer.contains("no")) {
                    System.exit(0);
                } else {
                    System.out.println("Could not find what you are looking for");
                    System.exit(0);
                }
            }
        // If the user answer no in the first place
        } else if(answer.contains("no")) {
            // Ask user to if want search for book
            System.out.println("Do you want to search for a book?");
            System.out.print("Please input yes or no: ");
            // Assign the user input into string variable
            String searchAnswer = scanner.nextLine();

            // If answer is yes
            if(searchAnswer.contains("yes")) {
                // get the keySet of the map where the registered books was added
                for(String key: registerBook.keySet()) {
                    System.out.println("Book is: " + registerBook.get(key));
                }
            // If the answer is no, exit
            } else if(searchAnswer.contains("no")) {
                System.exit(0);
            } else {
                System.out.println("Not sure what you are looking for");
                System.exit(0);
            }
        } else {
            System.out.println("Your answer is something else");
        }

    }
}
