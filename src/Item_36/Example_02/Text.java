package Item_36.Example_02;

import java.util.Set;

//EnumSet - a modern replacement for bit fields
public enum Text {
    INSTANCE;
    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    //Any Set could be passed in, but EnumSet is clearly best
    public void applyStyles(Set<Style> styles){}
}

// In summary: just because an enumerated type will be used in sets, there is no reason to represent it with bit fields.