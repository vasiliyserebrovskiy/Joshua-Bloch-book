package Item_50.Example_01;

import java.util.Date;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.01.2026)
 */
public class ExampleApp {
    public static void main(String[] args) {
        // Attack the intervals of Period instance
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        System.out.println(period);

        end.setYear(78);
        System.out.println(period);

    }
}
