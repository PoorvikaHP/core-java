class AmazonRunner {

    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        boolean login1 = amazon.login("amazonUser",8758);
        System.out.println(login1);

        String login2 = amazon.login("amazon@gmail.com", "amazon@123", "amazon@123");
        System.out.println(login2);

        String r1 = amazon.searchProduct("Laptop");
        System.out.println(r1);

        String r2 = amazon.searchProduct("Phone", "Apple");
        System.out.println(r2);

        String r3 = amazon.searchProduct("Watch", 5000);
        System.out.println(r3);

        String r4 = amazon.searchProductByCategory("Electronics");
        System.out.println(r4);

        String r5 = amazon.searchProduct("Shoes", "Puma", 4);
        System.out.println(r5);
    }
}