
import java.util.*;

public class Main {

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game game = new Game(2);
        int choice;

        // Do while loop until exit condition
        do {

            game.menu();

            System.out.print("\n\nPlease enter one of the menu options above: ");
            choice = input.nextInt();

            
                       // If 1 call upon length method
    if (choice == 1) {
        System.out.println("\n\n---------------------------------------------------\n\n");
        game.start();
    }
    // If 2 call upon width method
    else if (choice == 2) {
        System.out.println("\n\n---------------------------------------------------\n\n");
        game.rules();
    }
    // If 3 call upon startingCoordinates method
    else if (choice == 3) {
        System.out.println("\n\n---------------------------------------------------\n\n");
        game.printToFile();
    } else {
        // While loop for menu invalid input
        while (choice < 0 || choice > 3) {
            System.out.print("Invalid input! \nPlease input one of the menu selection: ");
            choice = input.nextInt();

        }

    }
    // Exit condition
} while (choice != 0);
System.out.println("Goodbye!");
}

}



