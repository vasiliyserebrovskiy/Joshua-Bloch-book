package Item_08;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (08.10.2025)
 */
public class Teenager {
    public static void main(String[] args) {
        new Room(99);
        System.out.println("Peace out");
        System.gc(); // добавление данной  команды приводит  к появлению строки Cleaning room.
    }
}
