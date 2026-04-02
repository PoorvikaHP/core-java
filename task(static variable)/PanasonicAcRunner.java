class PanasonicAcRunner{
public static void main(String[] args) {
System.out.println("--first time method call--");
boolean acStatus=PanasonicAc.onOrOff();
System.out.println("AC status:"+acStatus);

System.out.println("--second time method call--");
PanasonicAc.onOrOff();

System.out.println("--third time method call--");
PanasonicAc.onOrOff();

System.out.println("--fourth time method call--");
PanasonicAc.onOrOff();

System.out.println("--fifth time method call--");
PanasonicAc.onOrOff();
}
}