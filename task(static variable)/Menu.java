class Menu{

public void getMenuDetails(){
  System.out.println("Invoking getMenuDetails");
}
public void checkFoodByFoodName(String foodName){
    System.out.println("Invoking checkFoodByFoodName");
}
	public double checkFoodPriceByFoodName(String foodName){
    System.out.println("Invoking checkFoodPriceByFoodName");
    double foodPrice=0.0;
    if(foodName=="Idli"){
		foodPrice=40.00;
    } 
	else if(foodName == "Biryani"){
		foodPrice=110.00;
	}

    else if(foodName=="Poori"){
		foodPrice=50.00;
        System.out.println("Available");
    }

    else if(foodName=="Bisibele Bath"){
		foodPrice=50.00;
        System.out.println("Available");
    }

    else if(foodName=="Masala Dosa"){
		foodPrice=80.00;
        System.out.println("Available");
    }

    else if(foodName=="Aloo Parata"){
		foodPrice=60.00;
        System.out.println("Available");
    }
	else if(foodName=="chicken kabab"){
		foodPrice=110.00;
        System.out.println("Available");
    }
	else{
	System.out.println("not Available");
	}
	return foodPrice;
}
}