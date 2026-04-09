class Pharmacy {

    String name;
    String location;
    int medicines;
    int staff;
    String pharmacist;
    double revenue;
    boolean prescription;
    boolean open24hrs;
    int customers;
    int establishedYear;

    static String type = "Healthcare";
    static String country = "India";

    public String sellMedicine(String m) { 
	System.out.println(m); 
	return m;
	}
    public String buyMedicine(String m) { 
	System.out.println(m);
	return m;
	}
    public int countStock(int s) {
		System.out.println(s);
		return s;
		}
    public boolean checkPrescription(boolean p) { 
	System.out.println(p);
	return p; 
	}
    public double generateBill(double b) {
		System.out.println(b); 
		return b;
		}
    public String assignStaff(String s) { 
	System.out.println(s); 
	return s;
	}
    public boolean openStore(boolean o) {
		System.out.println(o); 
		return o;
		}
    public String provideAdvice(String a) { 
	System.out.println(a);
	return a; 
	}
    public boolean maintainStock(boolean s) {
		System.out.println(s);
		return s; 
		}
    public String generateReport(String r) { 
	System.out.println(r); 
	return r; 
	}
}