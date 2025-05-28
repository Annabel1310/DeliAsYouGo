class Chips {
    private String type;

    public Chips(double price) {
        this.price = price;
    }

    private double price;

    public Chips(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return 1.50;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;

    }
    public String toString(){
        return type + " - $1.50";
}




    }