package Item_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.10.2025)
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from LazySingleton!");
    }

    public static void main(String[] args) {
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();
        s1.sayHello();
        System.out.println(s1 == s2); // true
    }
}

