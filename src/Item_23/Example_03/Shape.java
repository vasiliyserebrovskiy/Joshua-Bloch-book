package Item_23.Example_03;


sealed interface Shape permits Circle, Rectangle {
    double area();
}
