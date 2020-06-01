package bookExampleMediumCodeWithInterface;

import bookExampleMediumCodeWithInterface.itemsImplemantation.MainDisplayImpl;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

// Main class
public class ItemsMainDemoWithInterface {

    public static void main(String[] args) {
        MainDisplayImpl mainDisplay = new MainDisplayImpl();
        Scanner scanner = new Scanner(System.in);
        Map<String, String> registeredItems = new ConcurrentHashMap<>();

        mainDisplay.display();
        while (scanner.hasNextLine()) {
            mainDisplay.userInput(scanner);
        }
    }

}
