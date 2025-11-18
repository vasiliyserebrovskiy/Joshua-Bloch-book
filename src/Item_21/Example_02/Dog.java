package Item_21.Example_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (14.11.2025)
 */
public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof-woof");
    }

    //Class Dog will use DEFAULT method move()
}
