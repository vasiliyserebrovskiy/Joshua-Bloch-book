package Item_26.Example_04;

import javax.swing.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (24.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        // BadBox example
        BadBox badBox = new BadBox();
        badBox.set("Hello");
//        Integer number = (Integer) badBox.get();  // ClassCastException at Runtime

        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        Integer number = intBox.get();  // safe
        System.out.println(number);

        Box<String> strBox = new Box<>();
        strBox.set("Hello my string!");
        String myStr = strBox.get();
        System.out.println(myStr);

    }
}
