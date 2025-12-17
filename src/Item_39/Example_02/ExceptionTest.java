package Item_39.Example_02;

// Annotation type with a parameter
import java.lang.annotation.*;
/**
 *  Indicates that the annotated method is a test method that
 *  must trow the designated exception to succeed.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
    Class<? extends Throwable> value();
}
