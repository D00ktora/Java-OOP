/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 6:44
 */
package P06InheritanceExercises.P06_05Restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish{
    public static final double SALMON_GRAMS = 22;
    public Salmon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);
    }
}
