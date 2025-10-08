package Item_05;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.10.2025)
 */
public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}
