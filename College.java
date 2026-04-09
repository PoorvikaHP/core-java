class College 
{
    String name;
	String location;
	int students;
	int teachers;
	String principal;
    double fee;
	boolean hostel;
	boolean library;
	int courses;
	int establishedYear;

    static String type = "Education";
    static String country = "India";

    public String admitStudent(String s)
	{ System.out.println(s);
	return s; 
	}
    public String assignTeacher(String t)
	{
		System.out.println(t);
	return t;
	}
    public double collectFee(double f)
	{
		System.out.println(f);
	return f;
	}
    public boolean conductExam(boolean e){
		System.out.println(e);
		return e;
		}
    public String announceHoliday(String h)
	{
		
		System.out.println(h);
		return h;
		}
    public int countStudents(int c)
	{ 
	System.out.println(c);
	return c; 
	}
    public boolean maintainDiscipline(boolean d)
	{ 
	System.out.println(d);
	return d; 
	}
    public String organizeEvent(String e)
	{ 
	System.out.println(e);
	return e; 
	}
    public boolean openLibrary(boolean l)
	{
		System.out.println(l);
	return l;
	}
    public String provideCourse(String c)
	{ 
	System.out.println(c);
	return c;
	}
}