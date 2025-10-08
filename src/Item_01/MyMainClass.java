package Item_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (29.09.2025)
 */
public class MyMainClass {
    public static void main(String[] args) {

        Car newCar = Car.hatchback();
        newCar.setMotor("V8");
        newCar.setPower("200 HP");
        Car  newCar2 = Car.sedan();
        newCar2.setMotor("V12");
        newCar2.setPower("300 HP");
        Car newCar3 = Car.LKV("V10", "280 HP");

        System.out.println(newCar);
        System.out.println(newCar2);
        System.out.println(newCar3);
    }
}
