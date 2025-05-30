public class DeliOptions {

    public enum SandwichSize {
        FOUR_INCH, EIGHT_INCH, TWELVE_INCH
    }

    public enum DrinkSize {
        SMALL(2.00),
        MEDIUM(2.50),
        LARGE(3.00);

        private final double price;

        DrinkSize(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
    }

    public enum DrinkType {
        SODA,
        LEMONADE,
        ICED_TEA;

        @Override
        public String toString() {
            return name().replace("_", " ").toLowerCase();
        }
    }

    public static class Drink {
        private final DrinkType type;
        private final DrinkSize size;

        public Drink(DrinkType type, DrinkSize size) {
            this.type = type;
            this.size = size;
        }


        public double getPrice() {
            return size.getPrice();
        }

        public DrinkType getType() {
            return type;
        }

        public DrinkSize getSize() {
            return size;
        }

        @Override
        public String toString() {
            return size + " " + type + " ($" + getPrice() + ")";
        }




    }

    public enum BreadType {
        WHITE(5.50, 7.00, 8.50),
        WHEAT(5.50, 7.00, 8.50),
        RYE(5.50, 7.00, 8.50),
        WRAP(5.50, 7.00, 8.50);

        private final double price4, price8, price12;

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

    public interface PricedTopping {
        ToppingType getType();
        String getDisplayName();
        double getPrice(SandwichSize size);
    }

    public enum MeatTopping implements PricedTopping {
        STEAK(ToppingType.MEAT, "Steak", 1.00, 2.00, 3.00),
        HAM(ToppingType.MEAT, "Ham", 1.00, 2.00, 3.00),
        SALAMI(ToppingType.MEAT, "Salami", 1.00, 2.00, 3.00),
        ROAST_BEEF(ToppingType.MEAT, "Roast Beef", 1.00, 2.00, 3.00),
        CHICKEN(ToppingType.MEAT, "Chicken", 1.00, 2.00, 3.00),
        BACON(ToppingType.MEAT, "Bacon", 1.00, 2.00, 3.00),
        EXTRA_MEAT(ToppingType.EXTRA_MEAT, "Extra Meat", 0.50, 1.00, 1.50);

        private final ToppingType type;
        private final String name;
        private final double price4, price8, price12;

        MeatTopping(ToppingType type, String name, double p4, double p8, double p12) {
            this.type = type;
            this.name = name;
            this.price4 = p4;
            this.price8 = p8;
            this.price12 = p12;
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

    public enum CheeseTopping implements PricedTopping {
        AMERICAN(ToppingType.CHEESE, "American", 0.75, 1.50, 2.25),
        PROVOLONE(ToppingType.CHEESE, "Provolone", 0.75, 1.50, 2.25),
        CHEDDAR(ToppingType.CHEESE, "Cheddar", 0.75, 1.50, 2.25),
        SWISS(ToppingType.CHEESE, "Swiss", 0.75, 1.50, 2.25),
        EXTRA_CHEESE(ToppingType.EXTRA_CHEESE, "Extra Cheese", 0.30, 0.60, 0.90);

        private final ToppingType type;
        private final String name;
        private final double price4, price8, price12;

        CheeseTopping(ToppingType type, String name, double p4, double p8, double p12) {
            this.type = type;
            this.name = name;
            this.price4 = p4;
            this.price8 = p8;
            this.price12 = p12;
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

    public enum RegularTopping implements PricedTopping {
        LETTUCE, PEPPERS, ONIONS, TOMATOES, JALAPENOS, CUCUMBERS, PICKLES, GUACAMOLE, MUSHROOMS;

        public ToppingType getType() {
            return ToppingType.REGULAR;
        }

        public String getDisplayName() {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }

        public double getPrice(SandwichSize size) {
            return 0.0;
        }

        @Override
        public String toString() {
            return getDisplayName();
        }
    }

    public enum SauceTopping implements PricedTopping {
        MAYO, MUSTARD, KETCHUP, RANCH, THOUSAND_ISLANDS, VINAIGRETTE;

        public ToppingType getType() {
            return ToppingType.SAUCE;
        }

        public String getDisplayName() {
            return name().replace('_', ' ').toLowerCase();
        }

        public double getPrice(SandwichSize size) {
            return 0.0;
        }

        @Override
        public String toString() {
            return getDisplayName();
        }
    }

    public enum SideTopping implements PricedTopping {
        AU_JUS, SAUCE;

        public ToppingType getType() {
            return ToppingType.SIDE;
        }

        public String getDisplayName() {
            return name().replace('_', ' ').toLowerCase();
        }

        public double getPrice(SandwichSize size) {
            return 0.0;
        }

        @Override
        public String toString() {
            return getDisplayName();
        }
    }

    public enum Chip {
        CLASSIC(1.50); // Expand as needed

        private final double price;

        Chip(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
}
