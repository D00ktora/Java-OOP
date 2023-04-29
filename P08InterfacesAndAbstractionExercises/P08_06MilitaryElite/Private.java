package P08InterfacesAndAbstractionExercises.P08_06MilitaryElite;

/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 20:02
 */
// Грешката ми тук е че не наследявам Soldier
public interface Private extends Soldier {
    double getSalary();
}
