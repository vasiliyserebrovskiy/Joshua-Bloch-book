package Item_41.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.12.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        ExportService service = new ExportService();

        service.export(new AuditLog());
        service.export(new Report());
//        service.export(new User()); // Compilation error

        // We can't do the same thing with annotation! + annotation work only at runtime.
        // Marker interface work at compile time!
    }
}
