package Item_21.Example_02;

public interface Animal {
    void makeSound();

    default void move() {
        System.out.println("This animal moves.");
    }
}
