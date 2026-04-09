class Gym {
    String name; 
	String location; 
	int trainers;
	int members;
	String owner;
    double fee;
	boolean hasCardio;
	boolean hasWeights;
	int equipment; 
	int establishedYear;

    static String type = "Fitness";
    static String country = "India";

    public String enrollMember(String m)
	{
	System.out.println(m);
	return m; 
	}
    public String assignTrainer(String t)
	{
	System.out.println(t);
	return t;
	}
    public boolean startWorkout(boolean w)
	{ 
	System.out.println(w);
	return w; 
	}
    public double collectFee(double f)
	{
	System.out.println(f);
	return f; 
	}
    public boolean maintainEquipment(boolean e)
	{
	System.out.println(e);
	return e;
	}
    public String scheduleSession(String s)
	{ 
	System.out.println(s);
	return s; 
	}
    public int countMembers(int c)
	{
	System.out.println(c); 
	return c; 
	}
    public boolean openGym(boolean o)
	{
	System.out.println(o); 
	return o; 
	}
    public String provideDietPlan(String d)
	{
	System.out.println(d);
	return d;
	}
    public boolean ensureSafety(boolean s)
	{
	System.out.println(s); 
	return s; 
	}
}