class Cinema {

    String name;
    String location;
    int screens;
    int seats;
    String owner;
    double ticketPrice;
    boolean has3D;
    boolean hasSnacks;
    int shows;
    int establishedYear;

    static String type = "Entertainment";
    static String country = "India";

    public String bookTicket(String t) 
	{ System.out.println(t); 
	return t;
	}
    public String cancelTicket(String t) {
		System.out.println(t);
		return t; 
		}
    public boolean playMovie(boolean p) { 
	System.out.println(p);
	return p;
	}
    public double collectAmount(double a) { 
	System.out.println(a);
	return a;
	}
    public int countAudience(int c) { 
	System.out.println(c);
	return c; 
	}
    public boolean manageShow(boolean s) { 
	System.out.println(s); 
	return s; 
	}
    public String advertise(String a) { 
	System.out.println(a); 
	return a; 
	}
    public boolean cleanHall(boolean c) { 
	System.out.println(c); 
	return c; 
	}
    public String sellSnacks(String s) 
	{ 
	System.out.println(s);
	return s; 
	}
    public boolean ensureSafety(boolean s) 
	{
		System.out.println(s);
		return s; 
		}
}