class MobileStore {

    static String mobileNames[] = {"iPhone","Samsung Galaxy","OnePlus","Vivo","Oppo","Redmi","Realme","Nothing"};
    static float mobilePrice[] = {80000f,60000f,45000f,30000f,25000f,20000f,18000f,35000f};
    static float mobileRatings[] = {4.8f,4.5f,4.4f,4.2f,4.1f,4.3f,4.0f,4.6f};
    static int mobileWarranty[] = {12,12,12,12,12,12,12,12};

    public static void getMobileDetails(){
        for(int i=0;i<mobileNames.length;i++){
            System.out.println("Mobile Name: "+mobileNames[i]);
            System.out.println("Price: "+mobilePrice[i]);
            System.out.println("Rating: "+mobileRatings[i]);
            System.out.println("Warranty: "+mobileWarranty[i]+" Months");
            System.out.println("   ");
        }
    }
}