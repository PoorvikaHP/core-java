class ITCompany {

    String name;
    String location;
    int employees;
    int projects;
    String CEO;
    double revenue;
    boolean remote;
    boolean training;
    int clients;
    int establishedYear;

    static String type = "Technology";
    static String country = "India";

    public String startProject(String p) { 
	System.out.println(p); 
	return p;
	}
    public String endProject(String p)
	{
		System.out.println(p); 
		return p;
		}
    public int countEmployees(int e) { 
	System.out.println(e); 
	return e;
	}
    public boolean conductMeeting(boolean m) { 
	System.out.println(m); 
	return m; 
	}
    public double generateRevenue(double r) {
		System.out.println(r);
		return r; 
		}
    public String assignTask(String t) {
		System.out.println(t); 
		return t; 
		}
    public boolean provideTraining(boolean t) {
		System.out.println(t); 
		return t;
		}
		
    public String hireEmployee(String h) { 
	System.out.println(h);
	return h; 
	}
    public boolean manageClient(boolean c) {
		System.out.println(c); 
		return c;
		}
    public String releaseProduct(String p) 
	{
		System.out.println(p);
		return p;
		}
}