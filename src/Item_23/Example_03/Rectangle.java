package Item_23.Example_03;

record Rectangle(double width, double height) implements Shape {
    @Override
    public double area() {
        return width * height;
    }
}
