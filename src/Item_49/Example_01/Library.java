package Item_49.Example_01;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (16.01.2026)
 */
public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        // Validate parameter
        Objects.requireNonNull(book, "Book cannot be null");
        if (book.getPages() <= 0) {
            throw new IllegalArgumentException("Book must have positive number of pages");
        }
        if (book.getTitle().isBlank()) {
            throw new IllegalArgumentException("Book title cannot be blank");
        }
        books.add(book);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books); // Defensive copy
    }
}
