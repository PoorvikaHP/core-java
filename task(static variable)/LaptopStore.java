class LaptopStore {

    static String laptopNames[] = {"Dell","HP","Lenovo","Apple","Acer","Asus","MSI","Samsung"};
    static float laptopPrice[] = {55000f,60000f,50000f,120000f,45000f,65000f,80000f,70000f};
    static float laptopRatings[] = {4.5f,4.4f,4.3f,4.8f,4.2f,4.4f,4.6f,4.1f};
    static int laptopRam[] = {8,16,8,16,8,16,32,16};

    public static void getLaptopDetails(){
        for(int i=0;i<laptopNames.length;i++){
            System.out.println("Laptop Name: "+laptopNames[i]);
            System.out.println("Price: "+laptopPrice[i]);
            System.out.println("Rating: "+laptopRatings[i]);
            System.out.println("RAM: "+laptopRam[i]+"GB");
            System.out.println("   ");
        }
    }
}