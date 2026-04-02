class WaterPumpRunner{
public static void main(String[] args) {
System.out.println("--first time method call--");
boolean status=WaterPump.onOrOff();
System.out.println("Water Pump status:"+status);

System.out.println("--second time method call--");
WaterPump.onOrOff();

System.out.println("--third time method call--");
WaterPump.onOrOff();

System.out.println("--fourth time method call--");
WaterPump.onOrOff();

System.out.println("--fifth time method call--");
WaterPump.onOrOff();
}
}