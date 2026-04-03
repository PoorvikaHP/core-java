class FruitRunner {
    public static void main(String[] args) {

        Fruit f1 = new Fruit("Apple", "Red", 120.0, false, "Sweet");
        Fruit f2 = new Fruit("Banana", "Yellow", 50.0, true, "Sweet");
        Fruit f3 = new Fruit("Mango", "Yellow", 150.0, true, "Sweet");
        Fruit f4 = new Fruit("Orange", "Orange", 80.0, false, "Sour");
        Fruit f5 = new Fruit("Grapes", "Green", 90.0, false, "Sweet");
        Fruit f6 = new Fruit("Papaya", "Orange", 70.0, true, "Sweet");
        Fruit f7 = new Fruit("Pineapple", "Yellow", 120.0, true, "Sweet");
        Fruit f8 = new Fruit("Guava", "Green", 60.0, true, "Sweet-Sour");
        Fruit f9 = new Fruit("Watermelon", "Green", 40.0, true, "Sweet");
        Fruit f10 = new Fruit("Cherry", "Red", 200.0, false, "Sweet");

        f1.displayDetails();
        f2.displayDetails();
        f3.displayDetails();
        f4.displayDetails();
        f5.displayDetails();
        f6.displayDetails();
        f7.displayDetails();
        f8.displayDetails();
        f9.displayDetails();
        f10.displayDetails();
    }
}