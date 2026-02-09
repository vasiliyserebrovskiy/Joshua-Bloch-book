package Item_90.Example_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (09.02.2026)
 */
public class ExampleApp {
    public static void main(String[] args) throws Exception {

        Period period = new Period(new Date(), new Date());

        // Сериализация
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("period.ser"));
        out.writeObject(period);
        out.close();

        // Десериализация
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("period.ser"));
        Period deserialized = (Period) in.readObject();
        in.close();

        System.out.println("Deserialized successfully!");
    }
}
