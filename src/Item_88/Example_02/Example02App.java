package Item_88.Example_02;

import Item_88.Example_01.Period;

import java.util.Date;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.02.2026)
 */
public class Example02App {
    public static void main(String[] args) {
        MutablePeriod mp = new MutablePeriod();
        Period p = mp.period;
        Date pEnd = mp.end;

        // Let's turn back the clock
        pEnd.setYear(78);
        System.out.println(p);

        // Bring back the 60s!
        pEnd.setYear(69);
        System.out.println(p);
    }
}
