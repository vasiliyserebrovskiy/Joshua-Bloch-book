package Item_60.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (23.01.2026)
 */
public class ExampleApp3 {
    public static void main(String[] args) {
        int itemsBought = 0;
        int funds = 100;
        for (int price = 10; funds >= price; price += 10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds);
    }
}