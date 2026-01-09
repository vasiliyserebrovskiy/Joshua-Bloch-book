package Item_45.Example_05;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (09.01.2026)
 */
public class ExampleApp {

    static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }

    public static void main(String[] args) {
        //Example 1
        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);

        // Example 2
        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(mp -> System.out.println(mp.bitLength() + " : " + mp));
    }
}
