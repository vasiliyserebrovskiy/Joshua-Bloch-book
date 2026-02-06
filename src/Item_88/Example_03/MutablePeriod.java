package Item_88.Example_03;

import java.io.*;
import java.util.Date;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.02.2026)
 */
public class MutablePeriod {
    // A period instance
    public final Period period;

    // period's start field, to which we shouldn't have access
    public final Date start;

    // period's end field, to which we shouldn't have access
    public final Date end;

    public MutablePeriod() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);

            // Serialize a valid Period instance
            out.writeObject(new Period(new Date(), new Date()));

            /*
             * Append rogue ""previos object refs for interval
             * Date fileds in Period. For details, see "Java Object Serialization Specification", "Section 6.4"
             */
            byte[] ref = {0x71, 0, 0x7e, 0, 5}; // Ref #5
            bos.write(ref); // the start field
            ref[4] = 4; // Ref # 4
            bos.write(ref); // The end field

            //Deserialize Period and "stolen" Date reference
            ObjectInputStream in = new ObjectInputStream(
                    new ByteArrayInputStream(bos.toByteArray()));
            period = (Period) in.readObject();
            start = (Date) in.readObject();
            end = (Date) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new AssertionError(e);
        }
    }

}
