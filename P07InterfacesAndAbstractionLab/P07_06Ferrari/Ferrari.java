/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 20.4.2023 г.
 * Time: 19:24
 */
package P07InterfacesAndAbstractionLab.P07_06Ferrari;

public class Ferrari implements Car{
    private String driverName;
    private String model;

    public Ferrari(String driverName) {
        this.driverName = driverName;
        this.model = "488-Spider";
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",this.model, this.brakes(), this.gas(), this.driverName);
    }
}
