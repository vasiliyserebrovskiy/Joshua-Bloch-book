package Item_21.Example_01;

public interface Animal {
    void makeSound();
    // We can not just add new method without broking class, which already exist and implement this interface
    // void move(); // We will have an error here, while class Dog did not implement this method.
}
