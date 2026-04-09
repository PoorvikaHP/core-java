class EventManagement {

    String name;
    String location;
    int staff;
    int events;
    String manager;
    double budget;
    boolean catering;
    boolean decoration;
    int clients;
    int establishedYear;

    static String type = "Service";
    static String country = "India";

    public String planEvent(String e) { 
	System.out.println(e);
	return e;
	}
    public String executeEvent(String e) { 
	System.out.println(e); 
	return e;
	}
    public int countEvents(int c) {
		System.out.println(c);
		return c;
		}
    public boolean manageBudget(boolean b) { 
	System.out.println(b); 
	return b;
	}
    public double collectPayment(double p) { 
	System.out.println(p);
	return p; 
	}
    public String assignStaff(String s) {
		System.out.println(s);
		return s;
		}
    public boolean arrangeCatering(boolean c) {
		System.out.println(c); 
		return c; 
		}
    public String decorate(String d) {
		System.out.println(d); 
		return d;
		}
    public boolean manageClients(boolean c) {
		System.out.println(c); 
		return c; 
		}
    public String generateReport(String r) {
		System.out.println(r); 
		return r; 
		}
}