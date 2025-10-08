package Item_04;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (02.10.2025)
 */
/*
Фраза «Enforce noninstantiability with a private constructor» часто встречается в книге Effective Java Джошуа Блоха.
Она означает: сделать невозможным создание экземпляров класса с помощью приватного конструктора.
🔹 Зачем это нужно?
Есть ситуации, когда мы не хотим, чтобы кто-то мог создавать объект этого класса:
Утилитарные классы (например, Math, Collections) — содержат только static методы и поля, объекты им не нужны.
Константные классы — где хранятся только public static final поля.
Singleton — управляем единственным экземпляром.
 */
public class UtilityClass {
    // Приватный конструктор — никто не сможет сделать new UtilityClass()
    private UtilityClass() {
        throw new AssertionError("Нельзя создавать экземпляры UtilityClass");
    }

    // Статический метод
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = UtilityClass.add(3, 4);
        System.out.println(result); // 7

        // UtilityClass u = new UtilityClass(); // ❌ Ошибка компиляции
    }
}

/*
🔹 Почему throw new AssertionError()?
Сам факт private конструктора уже не позволяет вызвать new извне.
Но рефлексия в Java может всё же обойти private и создать объект.
Чтобы этого избежать (или хотя бы предупредить), внутрь конструктора кладут throw new AssertionError().
Таким образом, даже если кто-то через reflection вызовет конструктор, он «упадёт» с исключением.
📌 В итоге: «Enforce noninstantiability with a private constructor» — это приём, чтобы сделать класс
«неинстанциируемым» (без объектов), оставив только static методы/поля.
 */