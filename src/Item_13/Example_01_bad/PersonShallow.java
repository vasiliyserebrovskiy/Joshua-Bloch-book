package Item_14.Example_01_bad;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (16.10.2025)
 */
class PersonShallow implements Cloneable {
    String name;        // immutable
    Address address;    // mutable

    PersonShallow(String name, Address address) {
        this.name = name; this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // <- superficial copying
    }

    @Override
    public String toString() {
        return name + " @ " + address;
    }

    public static void main(String[] args) throws Exception {
        PersonShallow p1 = new PersonShallow("Alice", new Address("Berlin"));
        PersonShallow p2 = (PersonShallow) p1.clone();

        System.out.println(p1); // Alice @ Berlin
        System.out.println(p2); // Alice @ Berlin
        System.out.println(p1 == p2); // false (different Objects)
        System.out.println(p1.address == p2.address); // true (same Address)

        // Change the address in p2 — will affect and on p1, because shallow copy
        p2.address.city = "Munich";
        System.out.println(p1); // Alice @ Munich  <-- unexpectedly for many
    }
}
