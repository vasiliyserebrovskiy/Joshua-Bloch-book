package Item_06;

import java.util.regex.Pattern;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (06.10.2025)
 */
public class Example {
    //Тут  Pattern будет создаваться при каждом вызове isRomanNumeral
    static boolean isRomanNumeral(String s) {
        return s.matches("Л(?=.)M*(C[MD]|D?C{0,3))"
                + "(X[CL]IL?X{0,3})(I[XV]IV?T{0,3})$");
    }
// Повторное использование дорогостоящего объекта
// для повышения производительности
    // Тут Pattern создается тольько один раз
    public class RomanNumerals {
        private static final Pattern ROMAN =
                Pattern.compile("Л(?=.)M*(C[MD]|D?C{0, 3})"
                        + "(X[CL]IL?X{0,3})(I[XV]|V?I(0,3})$");

        static boolean isRomanNumeral(String s) {
            return ROMAN.matcher(s).matches();
        }
    }
}
