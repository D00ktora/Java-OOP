package P12ReflectionExercises.P12_04BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType);
}
