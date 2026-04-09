class PetrolPump {

    String name;
    String location;
    int pumps;
    int staff;
    String owner;
    double fuelPrice;
    boolean diesel;
    boolean petrol;
    int customers;
    int establishedYear;

    static String type = "Fuel";
    static String country = "India";

    public String fillFuel(String f) {
	System.out.println(f); 
	return f;
	}
    public double collectCash(double c) { 
	System.out.println(c); 
	return c;
	}
    public int countCustomers(int c) { 
	System.out.println(c); 
	return c;
	}
    public boolean checkFuel(boolean f) { 
	System.out.println(f);
	return f;
	}
    public String provideService(String s) { 
	System.out.println(s); 
	return s;
	}
    public boolean openPump(boolean o) {
	System.out.println(o);
	return o;
	}
    public String assignWorker(String w) { 
	System.out.println(w);
	return w;
	}
    public boolean maintainPump(boolean m) {
	System.out.println(m); 
	return m; 
	}
    public String generateBill(String b) {
	System.out.println(b);
	return b; 
	}
    public boolean ensureSafety(boolean s) {
	System.out.println(s);
	return s; 
	}
}