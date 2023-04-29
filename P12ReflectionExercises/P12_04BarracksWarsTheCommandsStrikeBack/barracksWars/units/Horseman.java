/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 29.4.2023 г.
 * Time: 7:15
 */
package P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.units;

public class Horseman extends AbstractUnit{
    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;

    public Horseman() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
