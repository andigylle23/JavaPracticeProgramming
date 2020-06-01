package bookExampleMediumCodeWithInterface;

import bookExampleMediumCodeWithInterface.items.BooksImpl;
import bookExampleMediumCodeWithInterface.items.MovieImpl;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

// Main class
public class ItemsMainDemoWithInterface {

    public static void main(String[] args) {
        BooksImpl bookImpl = new BooksImpl();
        MovieImpl movieImpl = new MovieImpl();

        Scanner scanner = new Scanner(System.in);
        Map<String, String> registeredItems = new ConcurrentHashMap<>();

        display();

        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "b":
                    bookImpl.displayMessage();
                    bookImpl.userInput(scanner, registeredItems);
                    break;
                case "m":
                    movieImpl.displayMessage();
                    movieImpl.userInput(scanner, registeredItems);
                    break;
                case "q":
                    System.exit(0);
                    break;
                default:
                    System.out.println("The input choice is not in the list. Please check the choices and then try again");
                    display();
            }
        }
    }

    public static void display() {
        System.out.println("Do you want to check for books or movies");
        System.out.println("[b] Books\n[m] Movies\n[q] Quit");
        System.out.print("Enter your choice: ");
    }

}
