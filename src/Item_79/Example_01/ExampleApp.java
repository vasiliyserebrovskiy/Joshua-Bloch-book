package Item_79.Example_01;

import java.util.HashSet;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.02.2026)
 */
public class ExampleApp {
    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet(new HashSet());
        set.addObserver((s, e) -> System.out.println(e));
        for (int i = 0; i < 100; i++)
            set.add(i);
    }
}
