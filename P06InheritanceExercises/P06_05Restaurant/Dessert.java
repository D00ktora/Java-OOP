/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 6:42
 */
package P06InheritanceExercises.P06_05Restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{
    private double calories;
    public Dessert(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}
