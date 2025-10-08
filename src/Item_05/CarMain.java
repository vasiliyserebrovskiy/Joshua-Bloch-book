package Item_05;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.10.2025)
 */
/*
dependency  injection example!
 */
public class CarMain {
    public static void main(String[] args) {
        Engine diesel = new DieselEngine();
        Car dieselCar = new Car(diesel);
        dieselCar.drive();

        Engine  electric = new ElectricEngine();
        Car electricCar = new Car(electric);
        electricCar.drive();
    }
}
