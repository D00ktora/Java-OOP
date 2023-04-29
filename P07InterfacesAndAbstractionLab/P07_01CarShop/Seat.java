/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 7:30
 */
package P07InterfacesAndAbstractionLab.P07_01CarShop;

public class Seat implements Car{
    private String model;
    private String color;
    private Integer horsePower;
    private String producer;

    public Seat(String model, String color, Integer horsePower, String producer) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.producer = producer;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public Integer getHorsePower() {
        return null;
    }

    @Override
    public String countryProduced() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",this.model, this.producer, this.TIRES);
    }
}
