package Item_39.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (17.12.2025)
 */
// Program to proceed marker annotations
import java.lang.reflect.*;
public class RunTests {
    public static void main(String[] args) throws  Exception {

        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("Item_39.Example_01.Sample");
        for(Method m : testClass.getDeclaredMethods()){
            if (m.isAnnotationPresent(Test.class)){
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed:" + exc);
                } catch (Exception exc) {
                    System.out.println("Invalid @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed %d\n", passed, tests - passed);
    }
}
