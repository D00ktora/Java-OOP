/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 18:34
 */
package P10PolymorphismExercises.P10_02VehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicles{
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected Vehicles(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
        setTankCapacity(tankCapacity);

    }

    protected double getTankCapacity() {
        return tankCapacity;
    }

    protected void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    protected double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0 ) {
            System.out.println("Fuel must be a positive number");
            return;
        }
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
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
            return;
        }
        if (fuelQuantity + liters > tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
