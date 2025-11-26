package Item_28.Example_02;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.11.2025)
 */
// A first cut at making Chooser generic - won't compile
public class ChooserE2<T> {
        private final T[] choiceArray;

        public ChooserE2(Collection<T> choices) {
//            choiceArray = choices.toArray(); // Object[] cannot be converted to T[]
            choiceArray = (T[]) choices.toArray(); // warning: [unchecked] unchecked cast !
        }

    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }
}
