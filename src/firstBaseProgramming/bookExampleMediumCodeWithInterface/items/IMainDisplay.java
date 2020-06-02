package firstBaseProgramming.bookExampleMediumCodeWithInterface.items;

import java.util.Map;
import java.util.Scanner;

public interface IMainDisplay {
    void display();
    void userInput(Scanner scanner, Map<String, String> registeredItems);
}
