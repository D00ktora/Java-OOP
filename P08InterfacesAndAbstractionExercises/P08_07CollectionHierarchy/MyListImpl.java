/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 7:31
 */
package P08InterfacesAndAbstractionExercises.P08_07CollectionHierarchy;

public class MyListImpl extends Collection implements MyList{

    @Override
    public String remove() {
        String item = super.getItems().get(0);
        super.getItems().remove(0);
        return item;
    }

    @Override
    public int add(String toAdd) {
        super.getItems().add(0, toAdd);
        return 0;
    }

    @Override
    public int getUsed() {
        return super.getItems().size();
    }
}
