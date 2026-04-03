class Fruit {

    static int totalFruits = 100; 
    String name;
    String color;
    double pricePerKg;
    boolean isTropical;
    String taste;

    public Fruit() {

    }

    public Fruit(String name, String color, double pricePerKg, boolean isTropical, String taste) {
        this.name = name;
        this.color = color;
        this.pricePerKg = pricePerKg;
        this.isTropical = isTropical;
        this.taste = taste;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price per Kg: " + pricePerKg);
        System.out.println("Tropical: " + isTropical);
        System.out.println("Taste: " + taste);
        System.out.println("Total Fruits in Store: " + totalFruits);
        System.out.println("----------------------");
    }
}