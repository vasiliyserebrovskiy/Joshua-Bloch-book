package Item_25.Example_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (20.11.2025)
 */
// Static member classes instead of multiple top-level classes
public class TestApp {
    public static void main(String[] args) {
        System.out.println(Utensil.NAME + Dessert.NAME);
    }

    private static class Utensil {
        static final String NAME = "pan";
    }

    private static  class Dessert {
        static final String NAME = "cake";
    }
}
