package firstBaseProgramming.bookExampleMediumCodeEncapsulation.items;

import java.util.Scanner;

public interface IItems {
    void register(Scanner scanner, Items items);
    void searchForItem(Scanner scanner, Items items);
    void display();
    void choice(Scanner scanner, Items items);
}
