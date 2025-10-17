package Item_14.Example_01_bad;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (16.10.2025)
 */
class Address {
    String city;
    Address(String city) { this.city = city; }
    @Override public String toString() { return city; }
}
