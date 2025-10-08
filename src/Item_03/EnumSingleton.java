package Item_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.10.2025)
 */
public enum EnumSingleton {
    INSTANCE;

    public void sayHello() {
        System.out.println("Hello from EnumSingleton!");
    }

    public static void main(String[] args) {
        EnumSingleton s1 = EnumSingleton.INSTANCE;
        EnumSingleton s2 = EnumSingleton.INSTANCE;
        s1.sayHello();
        System.out.println(s1 == s2); // true
    }
}

