/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 18:40
 */
package P10PolymorphismExercises.P10_02VehiclesExtension;

public class Truck extends Vehicles {
    public static final double FUEL_INCREASE = 1.6;
    public static final double RESERVOAR_HOLE = 0.95;
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, (fuelConsumption + FUEL_INCREASE), tankCapacity);
    }
    @Override
    public void refueling(double liters) {
        super.refueling(liters * RESERVOAR_HOLE);
    }

}
