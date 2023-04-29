/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 6:37
 */
package P06InheritanceExercises.P06_05Restaurant;

import java.math.BigDecimal;

public class HotBeverage extends Beverage {
    public HotBeverage(String name, BigDecimal price, double mililiters) {
        super(name, price, mililiters);
    }
}
