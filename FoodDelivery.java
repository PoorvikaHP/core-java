class FoodDelivery {

    String name;
    String location;
    int agents;
    int orders;
    String manager;
    double charges;
    boolean fastDelivery;
    boolean tracking;
    int customers;
    int establishedYear;

    static String type = "Service";
    static String country = "India";

    public String placeOrder(String o) { 
	System.out.println(o); 
	return o;
	}
    public String cancelOrder(String o) { 
	System.out.println(o);
	return o; 
	}
    public int countOrders(int c) {
		System.out.println(c);
		return c;
		}
    public boolean trackOrder(boolean t) { 
	System.out.println(t);
	return t; 
	}
    public double collectPayment(double p) { 
	System.out.println(p);
	return p; 
	}
    public String assignAgent(String a) {
		System.out.println(a); 
		return a;
		}
    public boolean deliverFood(boolean d) {
		System.out.println(d); 
		return d; 
		}
    public String updateStatus(String s) { 
	System.out.println(s);
	return s; 
	}
    public boolean manageService(boolean s) { 
	System.out.println(s);
	return s; 
	}
    public String generateBill(String b) { 
	System.out.println(b); 
	return b; 
	}
}