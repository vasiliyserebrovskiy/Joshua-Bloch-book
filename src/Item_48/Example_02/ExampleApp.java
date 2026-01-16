package Item_48.Example_02;

import java.math.BigInteger;
import java.util.stream.LongStream;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.01.2026)
 */
public class ExampleApp {
    public static void main(String[] args) {

        long n = 1_000_000;
        //Example 1

        long start = System.nanoTime();
        long result = normal_pi(n);
        long time = System.nanoTime() - start;

        System.out.println("π(" + n + ") = " + result);
        System.out.println(time / 1_000_000 + " ms");

        System.out.println("=================");
        //Example 2
        long start2 = System.nanoTime();
        long result2 = parallel_pi(n);
        long time2 = System.nanoTime() - start2;

        System.out.println("π(" + n + ") = " + result2);
        System.out.println(time2 / 1_000_000 + " ms");

    }

    // normal pi
    static long normal_pi(long n) {
        return LongStream.rangeClosed(2,n)
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }

    static long parallel_pi(long n) {
        return LongStream.rangeClosed(2,n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }
}
