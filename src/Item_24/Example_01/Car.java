package Item_24.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.11.2025)
 */

/**
 * Bad example — unnecessary non-static inner class
 * A non-static inner class should only be used when it needs access to the instance members of the outer class.
 * If it does not need that, using a non-static inner class causes problems:
 * - it keeps an implicit reference to the outer class instance,
 * - it increases memory usage,
 * - it can cause memory leaks,
 * - it makes serialization harder.
 */
public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public class Engine {
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public void start() {
            System.out.println(model + " engine started with " + horsepower + " HP");
        }
    }
}
