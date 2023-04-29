/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 7:30
 */
package P07InterfacesAndAbstractionLab.P07_01CarShop;

public interface Car {
    public static final int TIRES = 4;

    public String getModel();
    public String getColor();
    public Integer getHorsePower();
    public String countryProduced();
}
