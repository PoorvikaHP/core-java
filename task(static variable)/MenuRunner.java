class MenuRunner{

    public static void main(String[] food){
	
Menu amaravathi = new Menu();
amaravathi.checkFoodByFoodName("chicken fried rice");
amaravathi.checkFoodByFoodName("chicken kabab");
amaravathi.checkFoodByFoodName("pongal");
amaravathi.checkFoodByFoodName("lemon rice");
amaravathi.checkFoodByFoodName("Poori");

System.out.println("----------------------------------------");

        
        Menu sodaFactory = new Menu();
        sodaFactory.checkFoodByFoodName("Aloo Parata");
		double price=amaravathi.checkFoodPriceByFoodName("Aloo Parata");
		System.out.println("price is:"+price);
				double price1=amaravathi.checkFoodPriceByFoodName("Masala Dosa");
						System.out.println("price is:"+price1);

		double price2=amaravathi.checkFoodPriceByFoodName("Bisibele Bath");
				System.out.println("price is:"+price2);

		double price3=amaravathi.checkFoodPriceByFoodName("Poori");
				System.out.println("price is:"+price3);

		double price4=amaravathi.checkFoodPriceByFoodName("lemon rice");
				System.out.println("price is:"+price4);



    }
}
 
       

        