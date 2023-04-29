/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 6:43
 */
package P06InheritanceExercises.P06_05Restaurant;

import java.math.BigDecimal;

public class Soup extends Starter{
    public Soup(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
