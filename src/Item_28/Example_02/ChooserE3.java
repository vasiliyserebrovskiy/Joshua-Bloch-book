package Item_28.Example_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.11.2025)
 */
// List-based Chooser - typesafe
public class ChooserE3<T> {
    private final List<T> choiceList;

    public ChooserE3(Collection<T> choices) {
        choiceList = new ArrayList<>(choices);
    }

    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
