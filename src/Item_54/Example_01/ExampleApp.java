package Item_54.Example_01;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.01.2026)
 */
public class ExampleApp {

    public static void main(String[] args) {
        Shop myCheese = new Shop("Cheeses");
        Cheese cheese1 = new Cheese("Cheese1");
        List<Cheese> cheeses = myCheese.getCheeses();

        if (cheeses != null && cheeses.contains(cheese1)) // without cheeses != null will have NullPointerException.
            System.out.println("Jolly good, just the thing");
        System.out.println("cheeses: " + cheeses);

        System.out.println("======");

        List<Cheese> cheeses2 = myCheese.getCheeses2();
        System.out.println("cheeses2: " + cheeses2);

        System.out.println("======");
        List<Cheese> cheeses3 = myCheese.getCheeses3();
        System.out.println("cheeses3: " + cheeses3);

        System.out.println("======");
        Cheese[] cheeses4 = myCheese.getCheeses4();
        System.out.println("cheeses4: " + Arrays.toString(cheeses4));

        System.out.println("======");
        Cheese[] cheeses5 = myCheese.getCheeses5();
        System.out.println("cheeses5: " + Arrays.toString(cheeses5));

        System.out.println("======");
        Cheese[] cheeses6 = myCheese.getCheeses6();
        System.out.println("cheeses4: " + Arrays.toString(cheeses6));

        System.out.println("End!");
    }
}
