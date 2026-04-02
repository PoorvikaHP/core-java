class SwiggyRunner {

    public static void main(String[] args) {

        Swiggy swiggy = new Swiggy();

        boolean login1 = swiggy.login("swiggyUser", "swiggy@123");
        System.out.println(login1);

        String login2 = swiggy.login("swiggy@gmail.com", "swiggy@123", "swiggy@123");
        System.out.println(login2);

        String r1 = swiggy.searchFood("Pizza");
        System.out.println(r1);

        String r2 = swiggy.searchFood("Burger", "KFC");
        System.out.println(r2);

        String r3 = swiggy.searchFood("Biryani", 300);
        System.out.println(r3);

        String r4 = swiggy.searchByCategory("Fast Food");
        System.out.println(r4);

        String r5 = swiggy.searchFood("Dosa", "Udupi", 5);
        System.out.println(r5);
    }
}