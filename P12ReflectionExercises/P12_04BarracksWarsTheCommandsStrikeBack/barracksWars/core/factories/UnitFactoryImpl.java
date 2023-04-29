package P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.core.factories;

import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Unit;
import P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.units.";

	@Override
	public Unit createUnit(String unitType){
		try {
			Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<Unit> constructor = unitClass.getConstructor();
			return constructor.newInstance();
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
				 InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
