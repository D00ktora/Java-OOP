package P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars;

import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.core.commands.CommadnInterpreterImpl;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.CommandInterpreter;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Repository;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Runnable;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.UnitFactory;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.core.Engine;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.core.factories.UnitFactoryImpl;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        CommandInterpreter commandInterpreter = new CommadnInterpreterImpl(repository, unitFactory);
        Runnable engine = new Engine(commandInterpreter);
        engine.run();
    }
}
