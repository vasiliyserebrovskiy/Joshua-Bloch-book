package Item_37.Example_02;

// Using ordinal() to index arrays of arrays - DON;T DO THIS!
public enum PhaseBad {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

        // Rows indexed by from-ordinal, cols by to-ordinal
        private static final Transition[][] TRANSITION = {
                {null, MELT, SUBLIME},
                {FREEZE, null, BOIL},
                {DEPOSIT, CONDENSE, null}
        };
    }
    // This program works and may even appear elegant, but appearances can be deceiving.
}
