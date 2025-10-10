package Item_10_11;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.10.2025)
 */
public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "diesel", 5, 150);
        Car car2 = new Car("Mazda", "diesel", 5, 150);
        Car car3 = new Car("Mazda", "benzin", 5, 150);
        Car car4 = new Car("Mazda", "benzin", 4, 150);

        System.out.println("Car 1  hash = " + car1.hashCode());
        System.out.println("Car 2  hash = " + car2.hashCode());
        System.out.println("Car 3  hash = " + car3.hashCode());
        System.out.println("Car 4  hash = " + car4.hashCode());

        System.out.println("Car 1  equals car 2 = " + car1.equals(car2));
        System.out.println("Car 2  equals car 1 = " + car2.equals(car1));
        System.out.println("Car 3  equals car 4 = " + car3.equals(car4));

    }
}
