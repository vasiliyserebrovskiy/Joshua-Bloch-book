package Item_02;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (29.09.2025)
 */
public class MyMainClass {
    public static void main(String[] args) {
//        System.out.println("Just test!");

    NutritionFacts  test = new NutritionFacts.Builder(240,10).build();
    System.out.println(test);

    NutritionFacts  test2 = new NutritionFacts.Builder(150,20)
            .calories(150).fat(100).sodium(50).carbohidrate(4).build();

        System.out.println(test2);

    }
}
