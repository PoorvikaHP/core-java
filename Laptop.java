class Laptop {
String brand;
    int ram;
    String processor;
    double price;
    String os;
public Laptop(){
 this("Dell", 8);
System.out.println("Default Constructor");
}
public Laptop(String brand, int ram) {
this("Dell", 8,"i5");
System.out.println("Two Parameter Constructor");
}
this(brand, ram, processor, 55000.0);
System.out.println("Three Parameter Constructor");
}
public Laptop(String brand, int ram, String processor, double price) {
this("Dell", 8, "i5",50.000);
System.out.println("Four Parameter Constructor");
}
public Laptop(String brand, int ram, String processor, double price, String os) {
        System.out.println("Brand : " + brand);
        System.out.println("RAM : " + ram);
        System.out.println("Processor : " + processor);
        System.out.println("Price : " + price);
}
}