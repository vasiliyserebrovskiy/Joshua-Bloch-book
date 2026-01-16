package Item_49.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (16.01.2026)
 */
public class Book {
    private final String title;
    private final int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return title + " (" + pages + " pages)";
    }
}
