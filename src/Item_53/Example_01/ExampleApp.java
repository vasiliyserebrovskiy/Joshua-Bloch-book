package Item_53.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.01.2026)
 */
public class ExampleApp {
    // Simple use of varargs
    static int sum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    // The WROMG way to use war args to pass one or more arguments!
    static int min(int... args) {
        if (args.length == 0)
            throw new IllegalArgumentException("Too few arguments");
        int min = args[0];
        for (int i = 1; i < args.length; i++)
            if (args[i] < min)
                min = args[i];
        return min;
    }

    // Te wright way to use varargs to pass one or more arguments
    static int min2(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs)
            if (arg < min)
                min = arg;
        return min;
    }

    public static void main(String[] args) {

        System.out.println("Sum (2,7,8) = " + sum(2, 7, 8));
        System.out.println("Sum () = " + sum());
        System.out.println("======");
//        System.out.println("Min ()" + min()); // throw exception
        System.out.println("Min (5, 2, 7, 4) = " + min(5, 2, 7, 4));
        System.out.println("======");
        System.out.println("Min (10, 1, 7, 4, 6) = " + min2(10, 1, 7, 4, 6));
    }
}
