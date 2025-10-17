package Item_14.Example_03_recommended;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (16.10.2025)
 */
class Address {
    String city;
    Address(String city) { this.city = city; }
    Address(Address other) { this.city = other.city; } // copy-constructor
    @Override public String toString() { return city; }
}