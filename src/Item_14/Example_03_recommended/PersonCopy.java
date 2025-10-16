package Item_14.Example_03_recommended;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (16.10.2025)
 */
class PersonCopy {
    String name;
    Address address;

    PersonCopy(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // copy-constructor: obvious, base, readable
    PersonCopy(PersonCopy other) {
        this.name = other.name;
        this.address = new Address(other.address); // deep copy of the address
    }

    @Override
    public String toString() {
        return name + " @ " + address;
    }

    public static void main(String[] args) {
        PersonCopy p1 = new PersonCopy("Eve", new Address("Zürich"));
        PersonCopy p2 = new PersonCopy(p1); // copy using constructor
        p2.address.city = "Basel";
        System.out.println(p1); // Eve @ Zürich
        System.out.println(p2); // Eve @ Basel
    }
}
