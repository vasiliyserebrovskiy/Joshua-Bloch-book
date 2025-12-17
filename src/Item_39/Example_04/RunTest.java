package Item_39.Example_04;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.12.2025)
 */
public class RunTest {
    public static void main(String[] args) throws Exception {

        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("Item_39.Example_03.Sample3");
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Item_39.Example_02.ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Test %s failed: no exception\n", m);
                } catch (InvocationTargetException wrappedEx) {
                    Throwable exc = wrappedEx.getCause();
                    int oldPassed = passed;
                    ExceptionTest[] excTests = m.getAnnotationsByType(ExceptionTest.class);
                    for (ExceptionTest excType : excTests) {
                        if (excType.value().isInstance(exc)) {
                            passed++;
                            break;
                        }
                    }
                    if (passed == oldPassed)
                        System.out.printf("Test %s failed: %s\n", m, exc);
                }
            }
            System.out.printf("Passed: %d, Failed %d\n", passed, tests - passed);
        }
    }
}
