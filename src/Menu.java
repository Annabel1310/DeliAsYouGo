import java.util.Scanner;

public class Menu {

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("""
                WELCOME TO DeliAsYouGo
                Enter options to proceed  
                1 - Add Sandwich
                2 - Add Drink
                3 - Add Chips
                4 - Signature sandwich
                5 - Checkout
                0 - Exit
                """);

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> {
                        System.out.println("Add Sandwich...");
                        System.out.println("Showing AddSandwich...");
                        AddSandwich addSandwich = new AddSandwich();
                        AddSandwich.runAddSandwich();
                    }
                    case 2 -> System.out.println("Add Drink...");
                    case 3 -> System.out.println("Add Chips...");
                    case 4 -> System.out.println("Signature sandwich...");
                    case 5 -> System.out.println("Checkout...");
                    case 0 -> System.out.println("Exiting. Thank you!");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                choice = -1;
            }

        } while (choice != 0);

        scanner.close();
    }


}
