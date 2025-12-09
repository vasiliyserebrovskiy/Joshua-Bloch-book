package Item_34.Example_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (09.12.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        System.out.println("Earth mass = " + Planet.EARTH.mass());
        System.out.println("Earth radius = " + Planet.EARTH.radius());
        System.out.println("Earth surface gravity = " + Planet.EARTH.surfaceGravity());
        System.out.println("Earth surface weight = " + Planet.EARTH.surfaceWeight(Planet.EARTH.mass()));

        // Example 2
        double earthWeight = Double.parseDouble("15"); // 15 kg
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %s is %f\n", p, p.surfaceWeight(mass));
        }
    }
}
