package Item_60.Example_01;

import java.math.BigDecimal;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (23.01.2026)
 */
public class ExampleApp2 {

    // Right way is use BigDecimal, int, or long for money calculations.
    public static void main(String[] args) {

        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0 ; price = price.add(TEN_CENTS)) {
            funds = funds.subtract(price);
            itemsBought++;
        }

        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds);
    }
}
