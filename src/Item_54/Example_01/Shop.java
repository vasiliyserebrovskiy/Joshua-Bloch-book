package Item_54.Example_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.01.2026)
 */

public class Shop {
    private final String name;
    private final List<Cheese> cheeseInStock = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }

    public void addCheese(Cheese cheeseName) {
        cheeseInStock.add(cheeseName);
    }

    /**
     * @return a list containing all of the cheeses in the shop,
     * or null if no cheeses are available for purchase.
     */
    // Returns null to indicate am empty collection. Don't do this!!!
    public List<Cheese> getCheeses() {
        return cheeseInStock.isEmpty() ? null : new ArrayList<>(cheeseInStock);
    }

    // The right way to return a possible empty collection
    public List<Cheese> getCheeses2() {
        return new ArrayList<>(cheeseInStock);
    }

    // Optimisation - avoids allocating empty collections
    public List<Cheese> getCheeses3() {
        return cheeseInStock.isEmpty() ? Collections.emptyList() : new ArrayList<>(cheeseInStock);
    }

    // The right way to return a possible empty array
    public Cheese[] getCheeses4() {
        return cheeseInStock.toArray(new Cheese[0]);
    }

    // Optimization - avoids allocating empty arrays
    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];
    public Cheese[] getCheeses5() {
        return cheeseInStock.toArray(EMPTY_CHEESE_ARRAY);
    }

    // Don't do this - prealocating the array harms performance!
    public Cheese[] getCheeses6() {
        return cheeseInStock.toArray(new Cheese[cheeseInStock.size()]);
    }
}
