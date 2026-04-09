class Hotel {
    String name; 
	String location;
	int rooms; 
	int staff;
	double rating;
    String owner; 
	double price; 
	boolean hasWifi; 
	boolean hasPool; 
	int establishedYear;

    static String country = "India";
    static String category = "Hospitality";

    public String bookRoom(String r){
	System.out.println(r); 
	return r; 
	}
    public String checkIn(String c){ 
	System.out.println(c); 
	return c; 
	}
    public String checkOut(String c){ 
	System.out.println(c); 
	return c;
	}
    public double payBill(double b){ 
	System.out.println(b); 
	return b;
	}
    public boolean provideService(boolean s){
		System.out.println(s); 
		return s; 
		}
    public String assignRoom(String r){
		System.out.println(r);
		return r; 
		}
    public boolean cleanRoom(boolean c){ 
	System.out.println(c); 
	return c;
	}
    public String orderFood(String f){ 
	System.out.println(f);
	return f; 
	}
    public boolean manageBooking(boolean b){ 
	System.out.println(b); 
	return b; 
	}
    public String giveFeedback(String f){ 
	System.out.println(f); 
	return f;
	}
}