package Item_56.Example_01;

import java.util.Objects;

/**
 * An immutable value object representing a book in a library catalog.
 * <p>
 * Instances of this class are thread-safe.
 *
 * <p><b>Note:</b> This class uses value-based equality.
 *
 * @author Vasilii Serebrovskii
 * @since 1.0
 */
public final class Book {

    private final String title;
    private final String author;
    private final int year;

    /**
     * Constructs a {@code Book} with the specified title, author, and publication year.
     *
     * @param title  the title of the book; must not be {@code null}
     * @param author the author of the book; must not be {@code null}
     * @param year   the year the book was published
     *
     * @throws NullPointerException if {@code title} or {@code author} is {@code null}
     * @throws IllegalArgumentException if {@code year} is negative
     */
    public Book(String title, String author, int year) {
        this.title = Objects.requireNonNull(title, "title");
        this.author = Objects.requireNonNull(author, "author");

        if (year < 0) {
            throw new IllegalArgumentException("year must be non-negative");
        }
        this.year = year;
    }

    /**
     * Returns the title of this book.
     *
     * @return the book title, never {@code null}
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of this book.
     *
     * @return the author's name, never {@code null}
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the publication year of this book.
     *
     * @return the publication year
     */
    public int getYear() {
        return year;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * Two {@code Book} instances are equal if and only if they have the same
     * title, author, and publication year.
     *
     * @param o the reference object with which to compare
     * @return {@code true} if this object is equal to the {@code o} argument;
     *         {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book other = (Book) o;
        return year == other.year
                && title.equals(other.title)
                && author.equals(other.author);
    }

    /**
     * Returns a hash code value for this book.
     *
     * @return a hash code value for this book
     */
    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    /**
     * Returns a string representation of this book.
     *
     * @return a string representation of this book
     */
    @Override
    public String toString() {
        return String.format("%s by %s (%d)", title, author, year);
    }
}
