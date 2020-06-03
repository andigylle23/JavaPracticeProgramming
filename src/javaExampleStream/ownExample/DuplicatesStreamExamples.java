package javaExampleStream.ownExample;

import javaExampleStream.ownExample.streamDuplicateItems.DuplicateItemsGroupingByImpl;
import javaExampleStream.ownExample.streamDuplicateItems.DuplicateItemsSetImpl;

import java.util.*;
import java.util.stream.Stream;

public class DuplicatesStreamExamples {
    public static void main(String[] args) {
        DuplicateItemsGroupingByImpl duplicateItemsGroupingBy = new DuplicateItemsGroupingByImpl();
        DuplicateItemsSetImpl duplicateItemsSet = new DuplicateItemsSetImpl();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        System.out.println("This is for stream");

        displayMessage();
        while(scanner.hasNextLine()) {
            userInput(scanner, nameList);
        }
    }

    public static void displayMessage() {
        System.out.println("Do you want to add names: ");
        System.out.println("[y]Yes\n[n]No");
        System.out.print("Please input your choice: ");
    }

    public static void userInput(Scanner scanner, ArrayList<String> arrayList) {
        String choice = scanner.nextLine();

        switch (choice) {
            case "y":
                nameList(scanner, arrayList);
                displayMessage();
                break;
            case "n":
                getNameList(arrayList);
                break;
            default:
                System.out.println("You should not be here");
                displayMessage();
        }
    }

    public static ArrayList<String> nameList(Scanner scanner, ArrayList<String> arrayList) {

            System.out.print("Please input a name: ");
            String name = scanner.nextLine();

            if(arrayList.contains(name)) {
                System.out.println("This name already exists");
            } else {
                arrayList.add(name);
            }
        return arrayList;
    }

    public static void getNameList(ArrayList<String> arrayList) {
        System.out.println("Here are the list::::");
        for(String names: arrayList) {
            System.out.println(names);
        }
    }


}
