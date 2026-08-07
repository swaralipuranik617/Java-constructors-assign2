class LibraryBook {
    final String ISBN;
    String title;
    String author;
    double price;

    LibraryBook(String ISBN, String title, String author, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

public class LibraryBookDemo {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook(
            "978-0135166307",
            "Java: The Complete Reference",
            "Herbert Schildt",
            850.00
        );

        book.displayBook();
    }
}