 class Airport {
    String name; 
	String location; 
	int terminals; 
	int runways; 
	int passengers;
    String director; 
	double revenue; 
	boolean international;
	boolean cargo; 
	int establishedYear;

    public String scheduleFlight(String f)
	{ System.out.println(f); 
	return f; 
	}
    public String landFlight(String f)
	{ System.out.println(f);
	return f; 
	}
    public String takeOffFlight(String f){ 
	System.out.println(f); 
	return f; 
	}
    public int checkPassengers(int p)
	{ System.out.println(p); 
	return p; 
	}
    public boolean securityCheck(boolean s){
	System.out.println(s); 
	return s; 
	}
    public double collectFee(double f){
	System.out.println(f); 
	return f; 
	}
    public String assignGate(String g){
	System.out.println(g); 
	return g; 
	}
    public boolean manageTraffic(boolean t){
	System.out.println(t); 
	return t; 
	}
    public String announce(String a){
	System.out.println(a); 
	return a; 
	}
    public boolean maintainSafety(boolean s){
	System.out.println(s); return s; 
	}
}