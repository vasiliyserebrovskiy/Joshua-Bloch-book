package Item_60.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (23.01.2026)
 */
public class ExampleApp {

    // Broken - uses floating point for monetary calculation
    public static void main(String[] args) {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; funds >= price; price += 0.10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }
}
