/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 17.4.2023 г.
 * Time: 20:09
 */
package P05InheritanceLab.P05_03RandomArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class RandomArrayList<E> extends ArrayList<E> {
    public Objects getRandomElement() {
        Objects randomElement = getRandomElement();
        remove(randomElement);
        return randomElement;
    }
}
