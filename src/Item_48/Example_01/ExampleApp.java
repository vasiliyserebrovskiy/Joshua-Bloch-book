package Item_48.Example_01;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.01.2026)
 */
public class ExampleApp {

    static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }

    public static void main(String[] args) {
        // Start example
        long start = System.nanoTime();

        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);

        long time = System.nanoTime() - start;
        System.out.println(time / 1_000_000 + " ms");

    }
}
