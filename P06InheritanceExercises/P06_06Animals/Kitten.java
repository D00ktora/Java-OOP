/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 6:51
 */
package P06InheritanceExercises.P06_06Animals;

public class Kitten extends Cat{
    public static final String GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }
    public String produceSound() {
        return "Meow";
    }
}
