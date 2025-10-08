package Item_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (29.09.2025)
 */
public class Car {
    private final String type;
    private String  motor;
    private String power;

    private Car(String type) {
        this.type = type;
    }

    public static Car sedan() {
        return new Car("sedan");
    }

    public static Car  hatchback() {
        return new Car("hatchback");
    }

    public static Car LKV(String motor, String power) {
        Car newCar = new  Car("LKV");
        newCar.setPower(power);
        newCar.setMotor(motor);
        return newCar;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", motor='" + motor + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
