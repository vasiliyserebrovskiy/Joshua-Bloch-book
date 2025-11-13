package Item_20.Example_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (13.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        MyOperation operation = new MyOperationImpl();
        operation.doSomething();
        operation.doAnotherThing();
    }
}
