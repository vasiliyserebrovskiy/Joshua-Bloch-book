package Item_24.Example_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        NutritionFacts facts = new NutritionFacts.Builder()
                .fat(15)
                .calories(100)
                .build();

        System.out.println("Calories: " + facts.getCalories());
        System.out.println("Fat: " + facts.getFat());
    }
}
