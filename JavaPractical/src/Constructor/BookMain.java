package Constructor;

public class BookMain {
    public static void main(String[] args) {

        Book bok = new Book();
        bok.show();

        Book book = new Book("Animal", "Geetanjali ", 299.00);
        book.show();

    }

}