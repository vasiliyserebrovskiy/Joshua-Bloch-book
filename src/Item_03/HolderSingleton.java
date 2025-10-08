package Item_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.10.2025)
 * Static inner class (holder)
 */
public class HolderSingleton {
    private HolderSingleton() {}

    private static class Holder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello from HolderSingleton!");
    }

    public static void main(String[] args) {
        HolderSingleton s1 = HolderSingleton.getInstance();
        HolderSingleton s2 = HolderSingleton.getInstance();
        s1.sayHello();
        System.out.println(s1 == s2); // true
    }
}

