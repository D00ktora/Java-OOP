/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 29.4.2023 г.
 * Time: 7:16
 */
package P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.units;

public class Gunner extends AbstractUnit{
    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;

    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_DAMAGE);
    }

}
