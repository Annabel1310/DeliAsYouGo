import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buttons {

    private static DeliOptions.BreadType selectedBread;
    private static DeliOptions.SandwichSize selectedSize;

    private static final List<DeliOptions.MeatTopping> premiumToppings = new ArrayList<>();
    private static final List<DeliOptions.RegularTopping> regularToppings = new ArrayList<>();
    private static final List<DeliOptions.CheeseTopping> cheeseToppings = new ArrayList<>();
    private static final List<DeliOptions.Chip> selectedChips = new ArrayList<>();
    private static final List<DeliOptions.Drink> selectedDrinks = new ArrayList<>();

    public static void runAddSandwich() {
        Scanner scanner = new Scanner(System.in);

        // === Choose Bread ===
        while (selectedBread == null) {
            System.out.println("\nChoose your bread:");
            DeliOptions.BreadType[] breads = DeliOptions.BreadType.values();
            for (int i = 0; i < breads.length; i++) {
                System.out.println((i + 1) + " - " + breads[i]);
            }
            try {
                int breadChoice = Integer.parseInt(scanner.nextLine().trim());
                if (breadChoice >= 1 && breadChoice <= breads.length) {
                    selectedBread = breads[breadChoice - 1];
                    System.out.println("You chose: " + selectedBread);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }

        // === Choose Size ===
        while (selectedSize == null) {
            System.out.println("\nChoose sandwich size:");
            DeliOptions.SandwichSize[] sizes = DeliOptions.SandwichSize.values();
            for (int i = 0; i < sizes.length; i++) {
                System.out.println((i + 1) + " - " + sizes[i]);
            }
            try {
                int sizeChoice = Integer.parseInt(scanner.nextLine().trim());
                if (sizeChoice >= 1 && sizeChoice <= sizes.length) {
                    selectedSize = sizes[sizeChoice - 1];
                    System.out.println("You chose: " + selectedSize);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }

        // === Choose Meats ===


        System.out.println("\nChoose one meat topping:");
        DeliOptions.MeatTopping[] meatTops = DeliOptions.MeatTopping.values();
        for (int i = 0; i < meatTops.length; i++) {
            System.out.println((i + 1) + " - " + meatTops[i].getDisplayName());
        }

        try {
            int choice = Integer.parseInt(scanner.nextLine().trim());
            if (choice >= 1 && choice <= meatTops.length) {
                DeliOptions.MeatTopping selected = meatTops[choice - 1];
                premiumToppings.add(selected);
                System.out.println("Added: " + selected.getDisplayName());
            } else {
                System.out.println("Invalid number. Skipping meat selection.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Skipping meat selection.");
        }

        // === Choose Cheeses ===
        System.out.println("\nChoose one cheese topping:");
        DeliOptions.CheeseTopping[] cheeseTops = DeliOptions.CheeseTopping.values();
        for (int i = 0; i < cheeseTops.length; i++) {
            System.out.println((i + 1) + " - " + cheeseTops[i].getDisplayName());
        }

        try {
            int choice = Integer.parseInt(scanner.nextLine().trim());
            if (choice >= 1 && choice <= cheeseTops.length) {
                DeliOptions.CheeseTopping selected = cheeseTops[choice - 1];
                cheeseToppings.add(selected);
                System.out.println("Added: " + selected.getDisplayName());
            } else {
                System.out.println("Invalid number. Skipping cheese selection.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Skipping cheese selection.");
        }

        System.out.println("\nChoose one regular topping:");
        DeliOptions.RegularTopping[] regularTops = DeliOptions.RegularTopping.values();
        for (int i = 0; i < regularTops.length; i++) {
            System.out.println((i + 1) + " - " + regularTops[i].getDisplayName());
        }

        try {
            int choice = Integer.parseInt(scanner.nextLine().trim());
            if (choice >= 1 && choice <= regularTops.length) {
                DeliOptions.RegularTopping selected = regularTops[choice - 1];
                regularToppings.add(selected);
                System.out.println("Added: " + selected.getDisplayName());
                System.out.println("\n✅ Sandwich added!");
            } else {
                System.out.println("Invalid number. Skipping regular topping selection.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Skipping regular topping selection.");
        }



    }
    public static void runAddChips() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nChoose a chip option:");

        DeliOptions.Chip[] chips = DeliOptions.Chip.values();
        for (int i = 0; i < chips.length; i++) {
            System.out.printf("%d - %s ($%.2f)%n", i + 1, chips[i].name(), chips[i].getPrice());
        }

        try {
            int chipChoice = Integer.parseInt(scanner.nextLine());
            if (chipChoice >= 1 && chipChoice <= chips.length) {
                DeliOptions.Chip selectedChip = chips[chipChoice - 1];
                selectedChips.add(selectedChip);
                System.out.println("You selected: " + selectedChip.name());
                System.out.println("\n✅ Chip added!");
            } else {
                System.out.println("Invalid chip choice.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }

    public static void runAddDrink() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nChoose a drink type:");
        DeliOptions.DrinkType[] types = DeliOptions.DrinkType.values();
        for (int i = 0; i < types.length; i++) {
            System.out.printf("%d - %s%n", i + 1, types[i]);
        }

        int typeChoice;
        try {
            typeChoice = Integer.parseInt(scanner.nextLine());
            if (typeChoice < 1 || typeChoice > types.length) {
                System.out.println("Invalid drink type.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.println("\nChoose a drink size:");
        DeliOptions.DrinkSize[] sizes = DeliOptions.DrinkSize.values();
        for (int i = 0; i < sizes.length; i++) {
            System.out.printf("%d - %s ($%.2f)%n", i + 1, sizes[i], sizes[i].getPrice());
        }

        int sizeChoice;
        try {
            sizeChoice = Integer.parseInt(scanner.nextLine());
            if (sizeChoice < 1 || sizeChoice > sizes.length) {
                System.out.println("Invalid drink size.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return;
        }

        // Create the drink object and add to list
        DeliOptions.Drink selectedDrink = new DeliOptions.Drink(types[typeChoice - 1], sizes[sizeChoice - 1]);
        selectedDrinks.add(selectedDrink);

        System.out.println("You selected: " + selectedDrink);
        System.out.println("\n✅ Drink added!");
    }

    public static void checkout() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder receipt = new StringBuilder();
        double total = 0.0;

        receipt.append("\n==================== RECEIPT ====================\n");

        // === Sandwich Section ===
        if (selectedBread != null && selectedSize != null) {
            double base = selectedBread.getBasePrice(selectedSize);
            receipt.append(String.format("Sandwich: %s (%s) - $%.2f%n", selectedBread, selectedSize, base));
            total += base;

            if (!premiumToppings.isEmpty()) {
                receipt.append("  Premium Toppings:\n");
                for (DeliOptions.MeatTopping meat : premiumToppings) {
                    double price = meat.getPrice(selectedSize);
                    receipt.append(String.format("    - %s: $%.2f%n", meat.getDisplayName(), price));
                    total += price;
                }
            }

            if (!cheeseToppings.isEmpty()) {
                receipt.append("  Cheese Toppings:\n");
                for (DeliOptions.CheeseTopping cheese : cheeseToppings) {
                    double price = cheese.getPrice(selectedSize);
                    receipt.append(String.format("    - %s: $%.2f%n", cheese.getDisplayName(), price));
                    total += price;
                }
            }

            if (!regularToppings.isEmpty()) {
                receipt.append("  Regular Toppings:\n");
                for (DeliOptions.RegularTopping topping : regularToppings) {
                    receipt.append("    - " + topping.getDisplayName() + "\n");
                }
            }
        } else {
            receipt.append("Sandwich: [none selected]\n");
        }

        // === Drinks Section ===
        if (!selectedDrinks.isEmpty()) {
            receipt.append("\nDrinks:\n");
            for (DeliOptions.Drink drink : selectedDrinks) {
                double price = drink.getPrice();
                receipt.append(String.format("  - %s (%s): $%.2f%n", drink.getType(), drink.getSize(), price));
                total += price;
            }
        } else {
            receipt.append("\nDrinks: [none selected]\n");
        }

        // === Chips Section ===
        if (!selectedChips.isEmpty()) {
            receipt.append("\nChips:\n");
            for (DeliOptions.Chip chip : selectedChips) {
                double price = chip.getPrice();
                receipt.append(String.format("  - %s: $%.2f%n", chip.name(), price));
                total += price;
            }
        } else {
            receipt.append("\nChips: [none selected]\n");
        }

        // === Total ===
        receipt.append("\n-----------------------------------------------\n");
        if (total == 0.0) {
            receipt.append("Your cart is empty.\n");
        } else {
            receipt.append(String.format("TOTAL: $%.2f%n", total));
            receipt.append("Thank you for your order!\n");
        }
        receipt.append("================================================\n");

        // === Print and Confirm ===
        System.out.println(receipt);
        System.out.print("✅ Confirm order and save receipt? (Y/N): ");
        String confirm = scanner.nextLine().trim().toLowerCase();

        if (confirm.equals("y") || confirm.equals("yes")) {
            ReceiptWriter.saveReceiptToFile(receipt.toString());selectedBread = null;
            selectedSize = null;
            premiumToppings.clear();
            cheeseToppings.clear();
            regularToppings.clear();
            selectedDrinks.clear();
            selectedChips.clear();

        } else {
            System.out.println("❌ Order not saved.");
        }
    }



}



