class FoodItemRunner {
    public static void main(String[] args) {

        FoodItem f1 = new FoodItem("Pizza", "Main Course", "Savory", 12.0, false);
        FoodItem f2 = new FoodItem("Burger", "Snack", "Savory", 8.0, false);
        FoodItem f3 = new FoodItem("Cake", "Dessert", "Sweet", 10.0, true);
        FoodItem f4 = new FoodItem("Salad", "Snack", "Fresh", 5.0, true);
        FoodItem f5 = new FoodItem("Pasta", "Main Course", "Savory", 11.0, true);
        FoodItem f6 = new FoodItem("Ice Cream", "Dessert", "Sweet", 4.0, true);
        FoodItem f7 = new FoodItem("Sandwich", "Snack", "Savory", 6.0, true);
        FoodItem f8 = new FoodItem("Samosa", "Snack", "Spicy", 2.0, true);
        FoodItem f9 = new FoodItem("Fried Chicken", "Main Course", "Spicy", 9.0, false);
        FoodItem f10 = new FoodItem("Donut", "Dessert", "Sweet", 3.0, true);

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