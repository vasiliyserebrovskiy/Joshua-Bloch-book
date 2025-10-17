package Item_14.Example_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (16.10.2025)
 */
class Address implements Cloneable {
    String city;
    Address(String city) { this.city = city; }
    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
    @Override public String toString() { return city; }
}
