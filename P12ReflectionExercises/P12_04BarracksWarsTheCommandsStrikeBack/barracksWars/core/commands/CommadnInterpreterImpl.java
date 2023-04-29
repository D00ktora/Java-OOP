/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 29.4.2023 г.
 * Time: 7:49
 */
package P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.core.commands;

import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.CommandInterpreter;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Executable;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Repository;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.UnitFactory;

public class CommadnInterpreterImpl implements CommandInterpreter {
    private Repository repository;
    private UnitFactory unitFactory;

    public CommadnInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        switch (commandName) {
            case "add":
                return new AddCommand(data, repository, unitFactory);
            case "report":
                return new ReportCommand(data, repository, unitFactory);
            case "fight":
                return new FightCommand(data, repository, unitFactory);
            case "retire":
                return new RetireCommand(data, repository, unitFactory);
            default:
                throw new RuntimeException("Invalid command!");
        }
    }
}
