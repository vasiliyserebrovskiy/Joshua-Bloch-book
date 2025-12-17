package Item_39.Example_02;

import Item_39.Example_01.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.12.2025)
 */
public class RunTest {

    public static void main(String[] args) throws  Exception {

        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("Item_39.Example_02.Sample2");
        for(Method m : testClass.getDeclaredMethods()){
            if (m.isAnnotationPresent(ExceptionTest.class)){
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Test %s failed: no exception\n", m);
                } catch (InvocationTargetException wrappedEx) {
                    Throwable exc = wrappedEx.getCause();
                    Class<? extends Throwable> excType = m.getAnnotation(ExceptionTest.class).value();
                    if (excType.isInstance(exc)) {
                        passed++;
                    } else {
                        System.out.printf("Test %s failed: executed %s, got %s\n", m, excType.getName(), exc);
                    }
                } catch (Exception exc) {
                    System.out.println("Invalid @ExceptionTest: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed %d\n", passed, tests - passed);
    }
}
