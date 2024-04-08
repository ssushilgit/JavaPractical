package Constructor;

public class Book {

    String name;
    String author;
    double price;

    // Default constructor
    Book(){
        name= "China Harayeko Manxe";
        author = "Hari Bansha Acharya ";
        price = 399.00;
        System.out.println("Default Constructor: ");
    }

    // Parameterized Constructor
    public Book(String nam, String auth, double paisa) {
        this.name = nam;
        this.author = auth;
        this.price = paisa;
        System.out.println("\nParameterized Construcor: ");
    }
    // display
    void show() {
        System.out.println("  Name: " + name + "\n  Author: " + author + "\n  Price: " + price);

    }

}