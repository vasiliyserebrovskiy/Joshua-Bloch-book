package Item_54.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.01.2026)
 */
public class Cheese {
    private final String name;

    public Cheese(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cheese {" +
                "name='" + name + '\'' +
                '}';
    }
}
