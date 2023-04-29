/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 6:51
 */
package P06InheritanceExercises.P06_06Animals;

public class Tomcat extends Cat{
    private static final String GENDER = "Male";
    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }
    public String produceSound() {
        return "MEOW";
    }
}
