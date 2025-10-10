package Item_10_11;

import java.util.Objects;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.10.2025)
 */
public class Car {
    private String name;
    private String  motor;
    private int numberOfDoors;
    private  int power;

    public Car(String name, String motor, int numberOfDoors, int power) {
        this.name = name;
        this.motor = motor;
        this.numberOfDoors = numberOfDoors;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", motor='" + motor + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors && power == car.power && Objects.equals(name, car.name) && Objects.equals(motor, car.motor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, motor, numberOfDoors, power);
    }
}
