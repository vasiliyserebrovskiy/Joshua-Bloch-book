package Item_15.Example_02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (21.10.2025)
 */
public class BadLibrary {
    private final List<String> books = new ArrayList<>();

    // ❌ Very BAD — return еру inner collection directly
    public List<String> getBooks() {
        return books;
    }
}
