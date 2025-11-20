package Item_24.Example_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.11.2025)
 */

/**
 * Good example — static nested class
 * If the inner class does not need access to instance fields of the outer class, it should be declared static.
 * A static nested class:
 * - does not keep a reference to the outer instance,
 * - uses less memory,
 * - avoids memory leaks,
 * - is easier to create and use.
 */
public class Car {
    private String model;

    public static class Engine {
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public void start() {
            System.out.println("Engine started with " + horsepower + " HP");
        }
    }
}
