/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 27.4.2023 г.
 * Time: 18:42
 */
package P10PolymorphismExercises.P10_02VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicles{
    public static final double FUEL_INCREASE = 1.4;

    protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }
    protected String driving(double distance, double additionalConsumptions) {
        DecimalFormat dm = new DecimalFormat("##.##");
        String result;
        setFuelConsumption(getFuelConsumption() + additionalConsumptions);
        if (this.getFuelQuantity() - (distance * getFuelConsumption()) > 0) {
            setFuelQuantity(getFuelQuantity() - (distance * getFuelConsumption()));
            result = String.format("%s travelled %s km", this.getClass().getSimpleName(), dm.format(distance));
        } else {
            result =  String.format("%s needs refueling",this.getClass().getSimpleName());
        }
        return result;
    }
}
