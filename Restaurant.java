class Restaurant {
    String name; 
	String location; 
	int tables; int staff; 
	String chef;
    double rating; 
	boolean veg; 
	boolean delivery; 
	int customers; 
	int establishedYear;

    static String country = "India";
    static String type = "Food Service";

    public String takeOrder(String o){
		System.out.println(o); 
		return o;
		}
    public String serveFood(String f){
		System.out.println(f);
		return f;
		}
    public double generateBill(double b){ 
	System.out.println(b);
	return b; 
	}
    public boolean cookFood(boolean c){
		System.out.println(c); 
		return c; 
		}
    public String reserveTable(String t){
		System.out.println(t); 
		return t;
		}
    public boolean cleanTable(boolean c){ 
	System.out.println(c); 
	return c;
	}
    public String hireChef(String c){ 
	System.out.println(c);
	return c;
	}
    public boolean manageKitchen(boolean k){
		System.out.println(k);
		return k; 
		}
    public String deliverOrder(String d){
		System.out.println(d); 
		return d;
		}
    public boolean maintainQuality(boolean q){
		System.out.println(q);
		return q; 
		}
}