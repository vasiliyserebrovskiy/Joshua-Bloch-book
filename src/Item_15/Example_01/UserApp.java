package Item_15.Example_01;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (21.10.2025)
 */
public class UserApp {
    public static void main(String[] args) {
        BadUser badUser = new BadUser("German", 25);
        System.out.println(badUser);
        badUser.age = -15; // can change
        System.out.println(badUser);

        System.out.println("==============");

        CorrectUser correctUser = new CorrectUser("Peter", 30);
        System.out.println(correctUser);
        //correctUser.setAge(-15); // Exception in thread "main" java.lang.IllegalArgumentException: Age cannot be negative
        correctUser.setAge(28);
        System.out.println(correctUser);
    }
}
