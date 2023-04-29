/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 6:29
 */
package P06InheritanceExercises.P06_04NeedForSpeed;

public class RaceMotorcycle extends Motorcycle{
    public static final double DEFAULT_FUEL_CONSUMPTION = 8;
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
