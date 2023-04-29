/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 7:28
 */
package P08InterfacesAndAbstractionExercises.P08_07CollectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable{


    @Override
    public String remove() {
        String lastItem = super.getItems().get(super.getItems().size() - 1);
        super.getItems().remove(super.getItems().size() - 1);
        return lastItem;
    }

    @Override
    public int add(String toAdd) {
        super.getItems().add(0, toAdd);
        return 0;
    }
}
