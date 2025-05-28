import java.util.Scanner;

public class Main {

    public static void HomeScreen() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("""
                WELCOME TO DeliAsYouGo
                Enter options to proceed  
                1 - Menu
                0 - Exit
                """);

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("Showing Menu...");
                        Menu menu = new Menu();
                        menu.runMenu();
                        break;
                    case 0:
                        System.out.println("Exiting. Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                choice = -1; // Reset choice to stay in loop
            }

        } while (choice != 0);

        scanner.close(); // Good practice
    }

    public static void main(String[] args) {
        HomeScreen();
    }
}
