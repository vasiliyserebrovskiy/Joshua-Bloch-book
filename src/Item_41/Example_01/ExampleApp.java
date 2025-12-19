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

        /*
        Bloch’s key idea (simplified)

            no - Do not use a marker interface as a flag
            no - Do not use it only for runtime checks
            yes - Use it to restrict APIs and types at compile time

        Mini-checklist (very useful)

            1 Before creating a marker interface, ask yourself:
            2 Will it be used as a parameter type or a generic bound?
            3 Does it prevent incorrect usage at compile time?
            4 Does it define a clear semantic contract?

        If the answer to any of these questions is “no” → a marker interface is a bad idea.
         */
    }
}
