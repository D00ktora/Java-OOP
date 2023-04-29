/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 29.4.2023 г.
 * Time: 8:02
 */
package P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.core.commands;

import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Repository;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.UnitFactory;

public class RetireCommand extends Command{
    protected RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        try {
            String unitType = getData()[1];
            getRepository().removeUnit(unitType);
            return String.format("%s retired!", unitType);
        } catch (IllegalArgumentException e ) {
            return e.getMessage();
        }
    }
}
