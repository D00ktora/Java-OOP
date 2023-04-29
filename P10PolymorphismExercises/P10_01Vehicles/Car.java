/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 18:38
 */
package P10PolymorphismExercises.P10_01Vehicles;

public class Car extends Vehicles {
    public static final double FUEL_INCREASE = 0.9;
    
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + FUEL_INCREASE);
    }

}
