package Item_15.Example_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (21.10.2025)
 */
public class CorrectLibrary {
    private final List<String> books = new ArrayList<>();

    public List<String> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public List<String> getBooks2() {
        return new ArrayList<>(books);
    }
}
