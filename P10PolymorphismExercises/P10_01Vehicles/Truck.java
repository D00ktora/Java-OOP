/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 18:40
 */
package P10PolymorphismExercises.P10_01Vehicles;

public class Truck extends Vehicles {
    public static final double FUEL_INCREASE = 1.6;
    public static final double RESERVOAR_HOLE = 0.95;
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + FUEL_INCREASE);
    }
    @Override
    public void refueling(double liters) {
        super.refueling(liters * RESERVOAR_HOLE);
    }

}
