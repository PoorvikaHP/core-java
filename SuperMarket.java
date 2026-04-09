class SuperMarket {
    String name; 
	String location; 
	int items;
	int employees; 
	double revenue;
    String manager; 
	boolean open24hrs;
	boolean hasParking; 
	int customers;
	int establishedYear;

    static String country = "India";
    static String type = "Retail";

    public String sellItem(String i){ 
	System.out.println(i);
	return i; 
	}
    public double generateBill(double b){ 
	System.out.println(b);
	return b;
	}
    public boolean restock(boolean r){
		System.out.println(r); 
		return r;
		}
    public String manageInventory(String i){ 
	System.out.println(i);
	return i;
	}
    public int countCustomers(int c){ 
	System.out.println(c); 
	return c; 
	}
    public boolean offerDiscount(boolean d){ 
	System.out.println(d);
	return d; 
	}
    public String hireStaff(String s){
		System.out.println(s); 
		return s; 
		}
    public boolean openStore(boolean o){ 
	System.out.println(o); 
	return o; 
	}
    public String advertise(String a){ 
	System.out.println(a); 
	return a; 
	}
    public boolean maintainCleanliness(boolean c){
		System.out.println(c); 
		return c;
		}
}