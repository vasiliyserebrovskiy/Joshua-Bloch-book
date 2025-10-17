package Item_14.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.10.2025)
 */
import java.util.*;

public class Person implements Comparable<Person> {
    private final String lastName;
    private final String firstName;
    private final int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = Objects.requireNonNull(lastName);
        this.firstName = Objects.requireNonNull(firstName);
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Use Comparator for accuracy and readability
        return Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getFirstName)
                .thenComparingInt(Person::getAge)
                .compare(this, other);
    }

    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return lastName + " " + firstName + " (" + age + ")";
    }

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Ivanov", "Ivan", 30),
                new Person("Petrov", "Anna", 25),
                new Person("Ivanov", "Ivan", 25),
                new Person("Ivanov", "Alex", 20)
        );
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}

