package Item_35.Example_01;
//Item 35: Use instance fields instead of ordinals

// Abuse of ordinal to derive an associated value = DON'T DO THIS
public enum Ensemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians() {
        return ordinal() +1;
    }
}
