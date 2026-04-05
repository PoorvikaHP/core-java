class Product {
String productName;
    int productId;
    String category;
    double price;
    String brand;

public Product() {
this("Mobile", 101);
 System.out.println("Default Constructor");
}
 public Product(String productName, int productId) {
 this("fan", 102, "Electronics");
  System.out.println("");
}
public Product(String productName, int productId, String category) {
 this(productName, productId, category, 15000.0);
   System.out.println("Three Parameter Constructor");
}
public Product(String productName, int productId, String category, double price) {
  this("mobile", productId, category, price, "Samsung");
 System.out.println("Four Parameter Constructor");
}
public Product(String productName, int productId, String category, double price, String brand) {
        System.out.println("Product : " + productName);
        System.out.println("ID : " + productId);
        System.out.println("Category : " + category);
        System.out.println("Price : " + price);
        System.out.println("Brand : " + brand);
}
}