package Item_15.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (21.10.2025)
 */
public class BadUser {
    public String name;
    public int age;

    public BadUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "BadUser {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
