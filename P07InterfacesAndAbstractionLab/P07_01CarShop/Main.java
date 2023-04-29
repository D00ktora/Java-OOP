/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 18.4.2023 г.
 * Time: 7:29
 */
package P07InterfacesAndAbstractionLab.P07_01CarShop;

public class Main {
    public static void main(String[] args) {
        Car seat = new Seat("Leon", "gray", 110, "Spain");

        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                seat.getModel(),
                seat.getColor(),
                seat.getHorsePower()));
        System.out.println(seat.toString());
    }

}
