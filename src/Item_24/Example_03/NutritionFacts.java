package Item_24.Example_03;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (19.11.2025)
 */

/**
 * Example — Builder pattern uses static nested classes
 * Bloch emphasizes that Builder classes must be static because they:
 * - do not need access to the outer instance,
 * - must be created before the outer object exists,
 * - should not carry an unnecessary reference.
 */
public class NutritionFacts {
    private final int calories;
    private final int fat;

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public static class Builder {
        private int calories;
        private int fat;

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.calories = builder.calories;
        this.fat = builder.fat;
    }
}
