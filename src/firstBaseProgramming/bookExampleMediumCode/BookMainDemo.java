package firstBaseProgramming.bookExampleMediumCode;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class BookMainDemo {

    public static void main(String[] args) {
        ChoiceMessage choiceMessage  = new ChoiceMessage();
        Answer answer = new Answer();
        Scanner scanner = new Scanner(System.in);
        Map<String, String> registeredBooks = new ConcurrentHashMap<>();

        choiceMessage.displayMessage();

        while(scanner.hasNextLine()) {
            answer.userInput(scanner, registeredBooks);
        }
    }
}
