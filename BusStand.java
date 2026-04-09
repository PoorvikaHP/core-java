class BusStand {
    String name; 
	String location;
	int buses;
	int platforms;
	int passengers;
    String manager;
	boolean hasShelter; 
	boolean hasTickets; 
	double revenue;
	int establishedYear;

    static String type = "Transport";
    static String country = "India";

    public String scheduleBus(String b)
	{
	System.out.println(b);
	return b;
	}
    public String arriveBus(String b)
	{
	System.out.println(b);
	return b; 
	}
    public String departBus(String b)
	{
	System.out.println(b);
	return b;
	}
    public int countPassengers(int p)
	{
	System.out.println(p);
	return p; 
	}
    public boolean issueTicket(boolean t)
	{
	System.out.println(t);
	return t; 
	}
    public double collectFare(double f)
	{
	System.out.println(f);
	return f;
	}
    public boolean manageTraffic(boolean m)
	{
	System.out.println(m);
	return m; 
	}
    public String assignPlatform(String p)
	{
	System.out.println(p); 
	return p;
	}
    public boolean maintainCleanliness(boolean c)
	{ System.out.println(c);
	return c; 
	}
    public String announce(String a)
	{
	System.out.println(a); 
	return a; 
	}
}