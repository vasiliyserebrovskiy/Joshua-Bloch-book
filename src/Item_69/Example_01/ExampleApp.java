package Item_69.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (27.01.2026)
 */
public class ExampleApp {

    public static void main(String[] args) {
        //Horrible abuse of exceptions. Don't ever do this!
        try {
            int i = 0;
            while(true) {
                range[i++].climb();
            }
        } catch (ArrayIndexOutOfBoundsException e) {}

        // Best way
        for (Mountain m : range) {
            m.climb();
        }
    }
}
