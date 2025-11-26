package Item_28.Example_02;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.11.2025)
 */
// Chooser - a class badly in need of generics!
public class ChooserE1 {
    private final Object[] choiceArray;

    public ChooserE1(Collection choices) {
        choiceArray = choices.toArray();
    }

    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }
}
