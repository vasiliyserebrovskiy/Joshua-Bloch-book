package Item_42.Example_02;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator op;

    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }

    // One line is ideal for a lambda, and three lines is a reasonable maximum!

    // If you want to create an instance of abstract Class, you can do this with an anonymous class, but not a lambda!!!!

    // Don;t use anonymous classes for function objects unless you have to create instances of types that aren't functional interfaces!
}
