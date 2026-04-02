class ElectricHeaterRunner{
public static void main(String[] args) {

System.out.println("--first time method call--");
boolean heaterStatus = ElectricHeater.onOrOff();
System.out.println("Heater status:" + heaterStatus);

System.out.println("--second time method call--");
ElectricHeater.onOrOff();

System.out.println("--third time method call--");
ElectricHeater.onOrOff();

System.out.println("--fourth time method call--");
ElectricHeater.onOrOff();

System.out.println("--fifth time method call--");
ElectricHeater.onOrOff();

}
}