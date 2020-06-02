package firstBaseProgramming.bookExampleMediumCodeEncapsulation;

import firstBaseProgramming.bookExampleMediumCodeEncapsulation.items.BookImplementation;
import firstBaseProgramming.bookExampleMediumCodeEncapsulation.items.Items;

import java.util.Scanner;

public class ItemsEncapsulationDemo {

    public static void main(String[] args) {
        BookImplementation bookImpl = new BookImplementation();
        Scanner scanner = new Scanner(System.in);
        Items items = new Items();

        display();

        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "b":
                    bookImpl.display();
                    bookImpl.choice(scanner, items);
                    break;
                case "m":
                    System.out.println("This is not yet implemented");
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
