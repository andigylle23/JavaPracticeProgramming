package firstBaseProgramming.bookExampleMediumCode;

public class ChoiceMessage {
    // Display message when the system will be load
    public void displayMessage() {
        System.out.println("Do you want to register a book or search");
        System.out.println("[r] Register\n[s] Search\n[q] Quit");
        System.out.print("Enter your choice: ");
    }
}
