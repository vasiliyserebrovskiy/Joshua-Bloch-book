package Item_34.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (09.12.2025)
 */
// Item 34: Use enum instead of int constants
public class ExampleApp {
    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;

    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;

    // simple enum variables
    public enum Apple {FIJI, PIPPIN, GRANNY_SMITH}
    public enum Orange {NAVEL, TEMPLE, BLOOD}


    public static void main(String[] args) {
        // Tasty citrus flavoured applesauce!
        int i = (APPLE_FUJI - ORANGE_TEMPLE) / APPLE_PIPPIN;

        System.out.println(i);
    }
}
