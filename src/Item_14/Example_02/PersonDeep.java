package Item_14.Example_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (16.10.2025)
 */
/* Some theory at the beginning


 */
class PersonDeep implements Cloneable {
    String name;
    Address address;

    PersonDeep(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public PersonDeep clone() { // covariant return type (can return PersonDeep)
        try {
            PersonDeep copy = (PersonDeep) super.clone(); // shallow fields copy
            // Now separately copying changeable fields
            copy.address = address.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e); // must not be, because we use Cloneable
        }
    }

    @Override
    public String toString() {
        return name + " @ " + address;
    }

    public static void main(String[] args) {
        PersonDeep p1 = new PersonDeep("Bob", new Address("Hamburg"));
        PersonDeep p2 = p1.clone();
        System.out.println(p1.address == p2.address); // false — now different Address
        p2.address.city = "Frankfurt";
        System.out.println(p1); // Bob @ Hamburg
        System.out.println(p2); // Bob @ Frankfurt
    }
}

