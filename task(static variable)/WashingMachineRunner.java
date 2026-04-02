class WashingMachineRunner{
public static void main(String[] args) {
System.out.println("--first time method call--");
boolean status=WashingMachine.onOrOff();
System.out.println("Washing Machine status:"+status);

System.out.println("--second time method call--");
WashingMachine.onOrOff();

System.out.println("--third time method call--");
WashingMachine.onOrOff();

System.out.println("--fourth time method call--");
WashingMachine.onOrOff();

System.out.println("--fifth time method call--");
WashingMachine.onOrOff();
}
}