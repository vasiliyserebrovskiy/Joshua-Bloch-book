package Item_36.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (11.12.2025)
 */
// This field enumeration constants - OBSOLETE!
public class Text {
    public static final int STYLE_BOLD = 1 << 0; // 1
    public static final int STYLE_ITALIC = 1 << 1; // 2
    public static final int STYLE_UNDERLINE = 1 << 2; //3
    public static final int STYLE_STRIKETHROUGH = 1 << 3; //4

    // There is no easy way to iterate over all of the elements represented by a bit field.

    public void applyStyles(int styles) {}
}
