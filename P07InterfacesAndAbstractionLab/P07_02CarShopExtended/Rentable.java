package P07InterfacesAndAbstractionLab.P07_02CarShopExtended;

/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 7:50
 */
public interface Rentable extends Car {

    int getMinRentDay();

    Double getPricePerDay();

}