class Book{
String title;
int pages;
String author;
double price;
String publisher;
public Book(){
this("Java Basics", 200);
System.out.println("Default Constructor");
}
public Book(String title, int pages) {
        this(title, pages, "John");
        System.out.println("Two Parameter Constructor");
}
public Book(String title, int pages, String author) {
        this(title, pages, author, 299.0);
        System.out.println("Three Parameter Constructor");
}
public Book(String title, int pages, String author, double price) {
        this(title, pages, author, price, "XYZ Publisher");
        System.out.println("Four Parameter Constructor");
}
public Book(String title, int pages, String author, double price, String publisher) {
        System.out.println("Title : " + title);
        System.out.println("Pages : " + pages);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("Publisher : " + publisher);
}
}