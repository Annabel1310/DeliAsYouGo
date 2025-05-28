import java.util.Scanner;

public class AddSandwich {

    public static void runAddSandwich() {
        Scanner scanner = new Scanner(System.in);
        int choice;
         do {
        System.out.println("""
                WELCOME TO DeliAsYouGo
                Enter options to proceed  
                1 - Add Bread
                2 - Choose BreadSize
                3 - Add Regular toppings
                4 - Add Toppings
                0 - Exit
                """);

        try {
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> System.out.println("Add Bread...");
                case 2 -> System.out.println("Choose BreadSize...");

                case 3 -> System.out.println("Add Toppings...");
                case 4 -> System.out.println("Add Regular Toppings...");
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
