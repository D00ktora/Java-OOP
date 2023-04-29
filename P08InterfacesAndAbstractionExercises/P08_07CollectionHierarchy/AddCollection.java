/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 7:23
 */
package P08InterfacesAndAbstractionExercises.P08_07CollectionHierarchy;

public class AddCollection extends Collection implements Addable{

    @Override
    public int add(String toAdd) {
        super.getItems().add(toAdd);
        return super.getItems().size() - 1;
    }
}
