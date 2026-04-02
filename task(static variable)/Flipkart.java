class Flipkart {

    public boolean login(String userName, String password) {
        System.out.println("Login with username: " + userName);

        String regUser = "user123";
        String regPass = "pass@123";

        if (userName != null && password != null &&
            userName == regUser && password == regPass) {
            return true;
        }
        return false;
    }

    public String login(String email, String password, String confirmPassword) {
        System.out.println("Login with email: " + email);

        String regEmail = "user@gmail.com";
        String regPass = "pass@123";

        if (email != null && password != null &&
            email == regEmail &&
            password == regPass &&
            password == confirmPassword) {
            return "Login successful";
        }
        return "Login failed";
    }

    public String searchProduct(String productName) {
        System.out.println("Searching by product name: " + productName);

        if (productName != null) {
            return "Product found: " + productName;
        }
        return "Product not found";
    }

    public String searchProduct(String productName, String brand) {
        System.out.println("Searching by product: " + productName + " brand: " + brand);

        if (productName != null && brand != null) {
            return "Product: " + productName + " Brand: " + brand;
        }
        return "Invalid search";
    }

    public String searchProduct(String productName, double price) {
        System.out.println("Searching by product: " + productName + " under price: " + price);

        if (productName != null) {
            return "Product: " + productName + " under price: " + price;
        }
        return "Invalid search";
    }

    public String searchProductByCategory(String category) {
        System.out.println("Searching category: " + category);

        if (category != null) {
            return "Category found: " + category;
        }
        return "Category not found";
    }

    public String searchProduct(String productName, String brand, int rating) {
        System.out.println("Searching product: " + productName + 
                           " brand: " + brand + " rating: " + rating);

        if (productName != null && brand != null) {
            return "Product: " + productName + 
                   " Brand: " + brand + 
                   " Rating: " + rating;
        }
        return "Invalid search";
    }
}