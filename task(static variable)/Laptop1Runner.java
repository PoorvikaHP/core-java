class Laptop1Runner{
public static void main(String[] args) {
System.out.println("--first time method call--");
boolean status=Laptop.onOrOff();
System.out.println("Laptop status:"+status);

System.out.println("--second time method call--");
Laptop.onOrOff();

System.out.println("--third time method call--");
Laptop.onOrOff();

System.out.println("--fourth time method call--");
Laptop.onOrOff();

System.out.println("--fifth time method call--");
Laptop.onOrOff();
}
}