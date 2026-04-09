class Warehouse {

    String name;
    String location;
    int capacity;
    int workers;
    String manager;
    double rent;
    boolean climateControl;
    boolean security;
    int goods;
    int establishedYear;

    static String type = "Storage";
    static String country = "India";

    public String storeGoods(String g) {
		System.out.println(g); 
		return g;
		}
    public String dispatchGoods(String g) 
	{ 
	System.out.println(g); 
	return g; }
	
    public int checkStock(int s) { 
	System.out.println(s);
	return s; 
	}
    public boolean maintainStorage(boolean m) {
		System.out.println(m); 
		return m; 
		}
    public double collectRent(double r) {
		System.out.println(r);
		return r;
		}
    public String assignWorker(String w)
	
	{
		System.out.println(w);
		return w; 
		}
    public boolean ensureSecurity(boolean s) {
		System.out.println(s);
		return s; 
		}
    public String trackGoods(String t) {
		System.out.println(t); 
		return t; 
		}
    public boolean manageInventory(boolean i) { 
	System.out.println(i); 
	return i;
	}

    public String generateReport(String r) {
		System.out.println(r); 
		return r; 
		}
}