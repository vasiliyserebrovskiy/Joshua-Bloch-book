package Item_50.Example_02;

import java.util.Date;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.01.2026)
 */
public class ExampleApp {

    public static void main(String[] args) {

        // Second attack on the internals of a Period instance
        Date start = new Date();
        Date end = new Date();

        Period p = new Period(start, end);
        System.out.println(p);
        p.end().setYear(78); // Modifies internals of p!
        System.out.println(p);
    }

}
