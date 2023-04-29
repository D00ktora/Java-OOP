/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 6:44
 */
package P06InheritanceExercises.P06_05Restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert {
    public static final double CAKE_GRAMS = 250;
    public static final double CAKE_CALORIES = 1000;
    public static final BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);

    public Cake(String name) {
        super(name, CAKE_PRICE, CAKE_GRAMS, CAKE_CALORIES);
    }
}
