package Practical;

class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "Default Title";
        this.author = "Default Author";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        // Creating an instance using the default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book - Title: " + defaultBook.getTitle() +
                ", Author: " + defaultBook.getAuthor() +
                ", Price: " + defaultBook.getPrice());

        // Creating an instance using the parameterized constructor
        Book paramBook = new Book("Java Programming", "Roman", 100.99);
        System.out.println("Parameterized Book - Title: " + paramBook.getTitle() +
                ", Author: " + paramBook.getAuthor() +
                ", Price: " + paramBook.getPrice());
    }
}

