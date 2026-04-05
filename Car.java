class Car{
static int carNo=75;
static String color="red";

public static void getCarDetails(){
System.out.println("method with no return type and no parameter");
}
public static void getCarDetails2(int carNo){
System.out.println("Car number:"+carNo);
}
public static String getCarDetails3(){
System.out.println("method with return type and no parameter:"+color);
return color;
}
public static String getCarDetails4(String color){
System.out.println("car color:"+color);
return color;
}
}