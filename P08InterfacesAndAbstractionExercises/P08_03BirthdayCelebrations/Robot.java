/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 20.4.2023 г.
 * Time: 19:56
 */
package P08InterfacesAndAbstractionExercises.P08_03BirthdayCelebrations;

public class Robot implements Identifiable {
    private String id;
    private String model;
    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getModel() {
        return model;
    }

}
