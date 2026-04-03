class FoodItem {

    static int totalItems = 50;  
    String name;
    String type;        
    String taste;       
    double price;       
    boolean isVegetarian;

    public FoodItem() {

    }

    public FoodItem(String name, String type, String taste, double price, boolean isVegetarian) {
        this.name = name;
        this.type = type;
        this.taste = taste;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public void displayDetails() {
        System.out.println("Food Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Taste: " + taste);
        System.out.println("Price: $" + price);
        System.out.println("Vegetarian: " + isVegetarian);
        System.out.println("Total Food Items: " + totalItems);
        System.out.println("---------------------------");
    }
}