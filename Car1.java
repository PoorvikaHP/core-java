class Car1{
String model;
int year;
String fuelType;
 double cost;
 String color;
 public Car() {
 this("Swift", 2020);
 System.out.println("Default Constructor");
}
public Car(String model, int year) {
 this("Swift", 2020, "Petrol");
 System.out.println("Two Parameter Constructor");
		}
public Car(String model, int year, String fuelType) {
this("Swift", 2020, "Petrol", 600000.0);
 System.out.println("Three Parameter Constructor");
}
public Car(String model, int year, String fuelType, double cost) {
 this( "Swift", 2020, "Petrol", 600000.0,"White");
  System.out.println("Four Parameter Constructor");
    }
public Car(String model, int year, String fuelType, double cost, String color) {
    System.out.println("Model : " + model);
     System.out.println("Year : " + year);
     System.out.println("Fuel : " + fuelType);
     System.out.println("Cost : " + cost);
      System.out.println("Color : " + color);
    }
}