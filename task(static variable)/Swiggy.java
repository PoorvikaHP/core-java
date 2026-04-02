class Swiggy {

    public boolean login(String userName, String password) {
        System.out.println("Login with username: " + userName);

        String regUser = "swiggyUser";
        String regPass = "swiggy@123";

        if (userName != null && password != null &&
            userName == regUser && password == regPass) {
            return true;
        }
        return false;
    }

    public String login(String email, String password, String confirmPassword) {
        System.out.println("Login with email: " + email);

        String regEmail = "swiggy@gmail.com";
        String regPass = "swiggy@123";

        if (email != null && password != null &&
            email == regEmail &&
            password == regPass &&
            password == confirmPassword) {
            return "Login successful";
        }
        return "Login failed";
    }

    public String searchFood(String foodName) {
        System.out.println("Searching food: " + foodName);

        if (foodName != null) {
            return "Food found: " + foodName;
        }
        return "Not found";
    }

    public String searchFood(String foodName, String restaurant) {
        System.out.println("Searching food: " + foodName + " restaurant: " + restaurant);

        if (foodName != null && restaurant != null) {
            return foodName + " at " + restaurant;
        }
        return "Invalid";
    }

    public String searchFood(String foodName, double price) {
        System.out.println("Searching food under price: " + price);

        if (foodName != null) {
            return foodName + " under " + price;
        }
        return "Invalid";
    }

    public String searchByCategory(String category) {
        System.out.println("Searching category: " + category);

        if (category != null) {
            return "Category: " + category;
        }
        return "Invalid";
    }

    public String searchFood(String foodName, String restaurant, int rating) {
        System.out.println("Searching food: " + foodName + " restaurant: " + restaurant + " rating: " + rating);

        if (foodName != null && restaurant != null) {
            return foodName + " " + restaurant + " rating " + rating;
        }
        return "Invalid";
    }
}