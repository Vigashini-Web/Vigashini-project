import java.util.HashMap;

// Custom Exception
class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

// Book class
class Book {
    String title;
    boolean isBorrowed;

    Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }
}

// Library class
class Library {
    private HashMap<String, Book> books = new HashMap<>();

    // Add a new book
    public void addBook(String title) {
        books.put(title,
