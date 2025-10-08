package Item_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.10.2025)
 * Double-checked locking
 */
public class DCLSingleton {
    private static volatile DCLSingleton instance;

    private DCLSingleton() {}

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from DCLSingleton!");
    }

    public static void main(String[] args) {
        DCLSingleton s1 = DCLSingleton.getInstance();
        DCLSingleton s2 = DCLSingleton.getInstance();
        s1.sayHello();
        System.out.println(s1 == s2); // true
    }
}

