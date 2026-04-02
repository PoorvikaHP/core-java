class BikeStore {

    static String bikeName[] = {"Classic 350","Duke 200","R15","Shine","Pulsar 220","Apache RTR 160","Splendor","Gixxer"};
    static String bikeBrand[] = {"Royal Enfield","KTM","Yamaha","Honda","Bajaj","TVS","Hero","Suzuki"};
    static float price[] = {190000f,210000f,180000f,90000f,150000f,120000f,80000f,140000f};
    static int mileage[] = {35,33,40,55,38,45,60,42};

    public static void getBikeDetails() {
        for(int i = 0; i < bikeName.length; i++) {
            System.out.println("Bike Name: " + bikeName[i]);
            System.out.println("Bike Brand: " + bikeBrand[i]);
            System.out.println("Price: " + price[i]);
            System.out.println("Mileage: " + mileage[i] + " kmpl");
            System.out.println("  ");
        }
    }
}