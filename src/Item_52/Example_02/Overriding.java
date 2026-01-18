package Item_52.Example_02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (18.01.2026)
 */
public class Overriding {
    public static void main(String[] args) {

        List<Wine> wineList = List.of(new Wine(), new SparklingWine(),  new Champagne());

        for (Wine wine :  wineList) {
            System.out.println(wine.name());
        }

    }
}
