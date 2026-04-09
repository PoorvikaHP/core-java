class PoliceStation {
    String name; 
	String location;
	int officers; 
	int cases; 
	String inspector;
    boolean hasLockup;
	boolean hasVehicles; 
	int jurisdiction; 
	double budget; 
	int establishedYear;

    static String country = "India";
    static String department = "Law Enforcement";

    public String registerCase(String c){ 
	System.out.println(c); 
	return c; 
	}
    public String investigate(String i){
		System.out.println(i); 
		return i; 
		}
    public boolean arrest(boolean a){ 
	System.out.println(a); 
	return a; 
	}
    public String fileReport(String r){ 
	System.out.println(r);
	return r; 
	}
    public boolean patrol(boolean p){ 
	System.out.println(p); 
	return p; 
	}
    public String assignOfficer(String o){
		System.out.println(o); 
		return o;
		}
    public int countCases(int c){ 
	System.out.println(c); 
	return c; 
	}
    public boolean maintainLaw(boolean l){ 
	System.out.println(l); 
	return l; 
	}
    public String handleComplaint(String c){ 
	System.out.println(c); 
	return c;
	}
    public boolean ensureSafety(boolean s){ 
	System.out.println(s); 
	return s; 
	}
}