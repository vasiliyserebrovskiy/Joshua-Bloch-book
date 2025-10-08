package Item_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.10.2025)
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from EagerSingleton!");
    }

    public static void main(String[] args) {
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();
        s1.sayHello();
        System.out.println(s1 == s2); // true
    }
}
