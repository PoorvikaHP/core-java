class AmazonProduct {

    static float productPrice[] = {1999.9f, 30000.5f, 25000.50f, 49000.05f, 20000.50f};
    static String productNames[] = {"oppo A11", "LG TV", "one plus", "Dell laptop", "redmi note9"};
    static float productRatings[] = {4.1f, 3.5f, 3.8f, 4.5f, 4.8f};

    public static void getAmazonProductPrice() {
        for (float val : productPrice) {
            System.out.println(val);
        }
    }

    public static void getAmazonProductDetails() {
        for (int index = 0; index < productNames.length; index++) {
            System.out.println("Product Name: " + productNames[index]);
            System.out.println("Product Price: " + productPrice[index]);
            System.out.println("Product Ratings: " + productRatings[index]);
            
        }
    }
}