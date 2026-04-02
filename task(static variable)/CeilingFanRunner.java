class CeilingFanRunner{
public static void main(String[] args) {
System.out.println("--first time method call--");
boolean status=CeilingFan.onOrOff();
System.out.println("Ceiling Fan status:"+status);

System.out.println("--second time method call--");
CeilingFan.onOrOff();

System.out.println("--third time method call--");
CeilingFan.onOrOff();

System.out.println("--fourth time method call--");
CeilingFan.onOrOff();

System.out.println("--fifth time method call--");
CeilingFan.onOrOff();
}
}