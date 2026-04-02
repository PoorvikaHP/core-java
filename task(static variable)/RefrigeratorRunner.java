class RefrigeratorRunner{
public static void main(String[] args) {
System.out.println("--first time method call--");
boolean status=Refrigerator.onOrOff();
System.out.println("Refrigerator status:"+status);

System.out.println("--second time method call--");
Refrigerator.onOrOff();

System.out.println("--third time method call--");
Refrigerator.onOrOff();

System.out.println("--fourth time method call--");
Refrigerator.onOrOff();

System.out.println("--fifth time method call--");
Refrigerator.onOrOff();
}
}