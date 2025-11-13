package Item_20.Example_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (13.11.2025)
 */
// public class
public class MyOperationImpl implements MyOperation {

    // The inner class inherits the skeletal implementation
    private class Delegate extends SkeletonOperation {
        @Override
        public void doSomething() {
            System.out.println("Custom implementation of doSomething");
        }
    }

    private final MyOperation delegate = new Delegate();

    // Delegating interface method calls to an internal object
    @Override
    public void doSomething() {
        delegate.doSomething();
    }

    @Override
    public void doAnotherThing() {
        delegate.doAnotherThing();
    }
}
