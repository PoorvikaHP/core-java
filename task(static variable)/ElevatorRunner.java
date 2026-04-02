class ElevatorRunner{
public static void main(String[] args) {
System.out.println("--first time method call--");
boolean status=Elevator.onOrOff();
System.out.println("Elevator status:"+status);

System.out.println("--second time method call--");
Elevator.onOrOff();

System.out.println("--third time method call--");
Elevator.onOrOff();

System.out.println("--fourth time method call--");
Elevator.onOrOff();

System.out.println("--fifth time method call--");
Elevator.onOrOff();
}
}