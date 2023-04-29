/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 18:34
 */
package P10PolymorphismExercises.P10_01Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicles{
    private double fuelQuantity;
    private double fuelConsumption;

    protected Vehicles(double fuelQuantity, double fuelConsumption) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
    }

    protected double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected String driving(double distance) {
        DecimalFormat dm = new DecimalFormat("##.##");
        if (this.fuelQuantity - (distance * fuelConsumption) > 0) {
            this.fuelQuantity -= (distance * fuelConsumption);
            return (String.format("%s travelled %s km", this.getClass().getSimpleName(), dm.format(distance)));
        } else {
            return String.format("%s needs refueling",this.getClass().getSimpleName());
        }
    }


    public void refueling(double liters) {
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
