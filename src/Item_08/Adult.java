package Item_08;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (08.10.2025)
 */
public class Adult {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)) {
            System.out.println("Goodbye");
        }
    }
}
