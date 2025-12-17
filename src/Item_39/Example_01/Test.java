package Item_39.Example_01;
// Marker annotation type declaration
import  java.lang.annotation.*;

/**
 * Indicates that the annotated methods is a test method.
 * Use only on parameterless static methods.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}
