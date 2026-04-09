class RailwayStation {
    String name; 
	String location;
	int platforms;
	int trains;
	int passengers;
    String stationMaster;
	double revenue;
	boolean hasWifi;
	boolean hasParking;
	int establishedYear;

    static String type = "Transport";
    static String country = "India";

    public String scheduleTrain(String t)
	{
		System.out.println(t); 
		return t; 
		}
    public String arriveTrain(String t)
	{
		System.out.println(t);
		return t;
		}
    public String departTrain(String t)
	{
		System.out.println(t);
		return t; 
		}
    public int countPassengers(int p){
		System.out.println(p); 
		return p; 
		}
    public boolean issueTicket(boolean i)
	{
		System.out.println(i);
		return i; 
		}
    public double collectFare(double f)
	{ 
	System.out.println(f);
	return f; 
	}
    public String assignPlatform(String p)
	{
		System.out.println(p);
		return p; 
		}
    public boolean maintainCleanliness(boolean c)
	{
		System.out.println(c); 
		return c; 
		}
    public String announce(String a)
	{
		System.out.println(a);
		return a;
		}
    public boolean ensureSafety(boolean s)
	{
		System.out.println(s); 
		return s; 
		}
}