package Item_35.Example_02;

// Never derive a value associated with an enum from its ordinals;
// store it in an instance field instead;
public enum Ensemble {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
    SEXTET(6), SEPTET(7), OCTET(8), DOUBLE_QUARTET(8),
    NONET(9), DECTET(10),TRIPLE_QUARTET(12);

    private final int numberOfMusiciansl;

    Ensemble(int size) {
        this.numberOfMusiciansl = size;
    }

    public int numberOfMusicians() {
        return numberOfMusiciansl;
    }

}
