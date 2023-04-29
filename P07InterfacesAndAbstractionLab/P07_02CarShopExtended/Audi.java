/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 7:46
 */
package P07InterfacesAndAbstractionLab.P07_02CarShopExtended;

public class Audi extends AbstractCar implements Rentable {

    private int minRentDays;
    private double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced,
                Integer minRentDays, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public int getMinRentDay() {
        return this.minRentDays;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator()
                + "Min Rent Days: " + this.getMinRentDay() + System.lineSeparator()
                + "Price per Day: " + this.getPricePerDay();
    }
}