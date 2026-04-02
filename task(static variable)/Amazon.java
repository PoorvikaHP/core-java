class Amazon {

    public boolean login(String userName, int OTP) {
        System.out.println("Login with username: " + userName);

        String regUser = "amazonUser";
        int regOTP = 8758;

        if (userName != null && OTP != 0&&
            userName == regUser && OTP == regOTP) {
            return true;
        }
        return false;
    }

    public String login(String email, String password, String confirmPassword) {
        System.out.println("Login with email: " + email);

        String regEmail = "amazon@gmail.com";
        String regPass = "amazon@123";

        if (email != null && password != null &&
            email == regEmail &&
            password == regPass &&
            password == confirmPassword) {
            return "Login successful";
        }
        return "Login failed";
    }

    public String searchProduct(String productName) {
        System.out.println("Searching product: " + productName);

        if (productName != null) {
            return "Product found: " + productName;
        }
        return "Not found";
    }

    public String searchProduct(String productName, String brand) {
        System.out.println("Searching product: " + productName + " brand: " + brand);

        if (productName != null && brand != null) {
            return productName + " " + brand;
        }
        return "Invalid";
    }

    public String searchProduct(String productName, double price) {
        System.out.println("Searching under price: " + price);

        if (productName != null) {
            return productName + " under " + price;
        }
        return "Invalid";
    }

    public String searchProductByCategory(String category) {
        System.out.println("Searching category: " + category);

        if (category != null) {
            return "Category: " + category;
        }
        return "Invalid";
    }

    public String searchProduct(String productName, String brand, int rating) {
        System.out.println("Searching product: " + productName + " brand: " + brand + " rating: " + rating);

        if (productName != null && brand != null) {
            return productName + " " + brand + " rating " + rating;
        }
        return "Invalid";
    }
}