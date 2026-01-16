package Item_49.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (16.01.2026)
 */
public class ExampleApp {
    public static void main(String[] args) {

        Library library = new Library();

        Book validBook = new Book("Effective Java", 416);
        library.addBook(validBook); // works ok

        Book invalidBook = new Book("", -50);

        library.addBook(invalidBook);
        // throws IllegalArgumentException immediately: Book must have positive number of pages
        // "Book title cannot be blank"


        /*
        Why this is a good example:

            1 Fails fast: Invalid books are rejected immediately.
            2 Clear exceptions: The message tells the user exactly what’s wrong.
            3 Defensive programming: The library can’t end up in an invalid state.
            4 Real-world relevance: Collections often need validation (e.g., users, orders, configurations).
         */
    }
}
