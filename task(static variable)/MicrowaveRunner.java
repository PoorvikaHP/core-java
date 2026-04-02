class MicrowaveRunner{
public static void main(String[] args) {
System.out.println("--first time method call--");
boolean status=Microwave.onOrOff();
System.out.println("Microwave status:"+status);

System.out.println("--second time method call--");
Microwave.onOrOff();

System.out.println("--third time method call--");
Microwave.onOrOff();

System.out.println("--fourth time method call--");
Microwave.onOrOff();

System.out.println("--fifth time method call--");
Microwave.onOrOff();
}
}