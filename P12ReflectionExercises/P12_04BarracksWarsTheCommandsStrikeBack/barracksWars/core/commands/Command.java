/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 29.4.2023 г.
 * Time: 7:20
 */
package P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.core.commands;

import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Executable;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Repository;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    protected Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected String[] getData() {
        return data;
    }

    protected Repository getRepository() {
        return repository;
    }

    protected UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
