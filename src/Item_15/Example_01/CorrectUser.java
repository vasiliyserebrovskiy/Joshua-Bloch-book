package Item_15.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (21.10.2025)
 */
public class CorrectUser {
    private String name;
    private int age;

    public CorrectUser(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() { return name; }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }

    @Override
    public String toString() {
        return "CorrectUser {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
