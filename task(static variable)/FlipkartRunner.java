class FlipkartRunner {

    public static void main(String[] args) {

        Flipkart flipkart = new Flipkart();

        boolean login1 = flipkart.login("user123", "pass@123");
        System.out.println(login1);

        String login2 = flipkart.login("user@gmail.com", "pass@123", "pass@123");
        System.out.println(login2);

        String result1 = flipkart.searchProduct("Laptop");
        System.out.println(result1);

        String result2 = flipkart.searchProduct("Mobile", "Samsung");
        System.out.println(result2);

        String result3 = flipkart.searchProduct("Headphones", 2000);
        System.out.println(result3);

        String result4 = flipkart.searchProductByCategory("Electronics");
        System.out.println(result4);

        String result5 = flipkart.searchProduct("Shoes", "Nike", 4);
        System.out.println(result5);
    }
}