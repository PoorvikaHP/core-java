class TelevisionRunner{
public static void main(String[] args) {
System.out.println("--first time method call--");
boolean status=Television.onOrOff();
System.out.println("Television status:"+status);

System.out.println("--second time method call--");
Television.onOrOff();

System.out.println("--third time method call--");
Television.onOrOff();

System.out.println("--fourth time method call--");
Television.onOrOff();

System.out.println("--fifth time method call--");
Television.onOrOff();
}
}