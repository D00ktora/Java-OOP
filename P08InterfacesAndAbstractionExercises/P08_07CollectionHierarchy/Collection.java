/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 7:22
 */
package P08InterfacesAndAbstractionExercises.P08_07CollectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    private static final int maxSize = 100;
    private List<String> items;

    public Collection() {
        this.items = new ArrayList<>();
    }

    public List<String> getItems() {
        return items;
    }
}
