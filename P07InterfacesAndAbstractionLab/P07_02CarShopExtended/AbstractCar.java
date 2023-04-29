/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 7:37
 */
package P07InterfacesAndAbstractionLab.P07_02CarShopExtended;

public abstract class AbstractCar implements Car {

    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;

    AbstractCar(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires.",
                this.getModel(), this.countryProduced, TYRES);
    }
}
