package Item_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.10.2025)
 */
public class SyncSingleton {
    private static SyncSingleton instance;

    private SyncSingleton() {}

    public static synchronized SyncSingleton getInstance() {
        if (instance == null) {
            instance = new SyncSingleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from SyncSingleton!");
    }

    public static void main(String[] args) {
        SyncSingleton s1 = SyncSingleton.getInstance();
        SyncSingleton s2 = SyncSingleton.getInstance();
        s1.sayHello();
        System.out.println(s1 == s2); // true
    }
}

