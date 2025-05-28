public class DeliOptions {

    public enum SandwichSize {
        FOUR_INCH, EIGHT_INCH, TWELVE_INCH
    }

    public enum DrinkSize {
        SMALL, MEDIUM, LARGE
    }

    public enum BreadType {
        WHITE(5.50, 7.00, 8.50),
        WHEAT(5.50, 7.00, 8.50),
        RYE(5.50, 7.00, 8.50),
        WRAP(5.50, 7.00, 8.50);

        private final double price4;
        private final double price8;
        private final double price12;

        BreadType(double price4, double price8, double price12) {
            this.price4 = price4;
            this.price8 = price8;
            this.price12 = price12;
        }

        public double getBasePrice(SandwichSize size) {
            return switch (size) {
                case FOUR_INCH -> price4;
                case EIGHT_INCH -> price8;
                case TWELVE_INCH -> price12;
            };
        }

        @Override
        public String toString() {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
    }

    public enum ToppingType {
        MEAT, EXTRA_MEAT, CHEESE, EXTRA_CHEESE, REGULAR, SAUCE, SIDE
    }

    public enum Topping {
        // Meats
        STEAK(ToppingType.MEAT, "Steak", 1.00, 2.00, 3.00),
        HAM(ToppingType.MEAT, "Ham", 1.00, 2.00, 3.00),
        SALAMI(ToppingType.MEAT, "Salami", 1.00, 2.00, 3.00),
        ROAST_BEEF(ToppingType.MEAT, "Roast Beef", 1.00, 2.00, 3.00),
        CHICKEN(ToppingType.MEAT, "Chicken", 1.00, 2.00, 3.00),
        BACON(ToppingType.MEAT, "Bacon", 1.00, 2.00, 3.00),
        EXTRA_MEAT(ToppingType.EXTRA_MEAT, "Extra Meat", 0.50, 1.00, 1.50),

        // Cheeses
        AMERICAN(ToppingType.CHEESE, "American", 0.75, 1.50, 2.25),
        PROVOLONE(ToppingType.CHEESE, "Provolone", 0.75, 1.50, 2.25),
        CHEDDAR(ToppingType.CHEESE, "Cheddar", 0.75, 1.50, 2.25),
        SWISS(ToppingType.CHEESE, "Swiss", 0.75, 1.50, 2.25),
        EXTRA_CHEESE(ToppingType.EXTRA_CHEESE, "Extra Cheese", 0.30, 0.60, 0.90),

        // Regular Toppings - Included
        LETTUCE(ToppingType.REGULAR, "Lettuce", 0, 0, 0),
        PEPPERS(ToppingType.REGULAR, "Peppers", 0, 0, 0),
        ONIONS(ToppingType.REGULAR, "Onions", 0, 0, 0),
        TOMATOES(ToppingType.REGULAR, "Tomatoes", 0, 0, 0),
        JALAPENOS(ToppingType.REGULAR, "Jalapeños", 0, 0, 0),
        CUCUMBERS(ToppingType.REGULAR, "Cucumbers", 0, 0, 0),
        PICKLES(ToppingType.REGULAR, "Pickles", 0, 0, 0),
        GUACAMOLE(ToppingType.REGULAR, "Guacamole", 0, 0, 0),
        MUSHROOMS(ToppingType.REGULAR, "Mushrooms", 0, 0, 0),

        // Sauces - Included
        MAYO(ToppingType.SAUCE, "Mayo", 0, 0, 0),
        MUSTARD(ToppingType.SAUCE, "Mustard", 0, 0, 0),
        KETCHUP(ToppingType.SAUCE, "Ketchup", 0, 0, 0),
        RANCH(ToppingType.SAUCE, "Ranch", 0, 0, 0),
        THOUSAND_ISLANDS(ToppingType.SAUCE, "Thousand Islands", 0, 0, 0),
        VINAIGRETTE(ToppingType.SAUCE, "Vinaigrette", 0, 0, 0),

        // Sides - Included
        AU_JUS(ToppingType.SIDE, "Au Jus", 0, 0, 0),
        SAUCE(ToppingType.SIDE, "Sauce", 0, 0, 0);

        private final ToppingType type;
        private final String name;
        private final double price4;
        private final double price8;
        private final double price12;

        Topping(ToppingType type, String name, double price4, double price8, double price12) {
            this.type = type;
            this.name = name;
            this.price4 = price4;
            this.price8 = price8;
            this.price12 = price12;
        }

        public ToppingType getType() {
            return type;
        }

        public String getDisplayName() {
            return name;
        }

        public double getPrice(SandwichSize size) {
            return switch (size) {
                case FOUR_INCH -> price4;
                case EIGHT_INCH -> price8;
                case TWELVE_INCH -> price12;
            };
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public enum Drink {
        SMALL(2.00),
        MEDIUM(2.50),
        LARGE(3.00);

        private final double price;

        Drink(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    public enum Chip {
        CLASSIC(1.50); // You can add more chip types here later if needed

        private final double price;

        Chip(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
}
