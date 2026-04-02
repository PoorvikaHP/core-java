class PrinterRunner{
public static void main(String[] args) {
System.out.println("--first time method call--");
boolean status=Printer.onOrOff();
System.out.println("Printer status:"+status);

System.out.println("--second time method call--");
Printer.onOrOff();

System.out.println("--third time method call--");
Printer.onOrOff();

System.out.println("--fourth time method call--");
Printer.onOrOff();

System.out.println("--fifth time method call--");
Printer.onOrOff();
}
}