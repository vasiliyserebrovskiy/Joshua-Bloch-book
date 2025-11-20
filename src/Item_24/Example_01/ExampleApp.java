package Item_24.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Car.Engine engine = car.new Engine(150);
        engine.start();
    }
}
