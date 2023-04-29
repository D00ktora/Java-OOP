/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 15.4.2023 г.
 * Time: 6:29
 */
package P01WorkingWithAbstraction.P04HotelReservation;

import static P01WorkingWithAbstraction.P04HotelReservation.DiscountType.*;
import static P01WorkingWithAbstraction.P04HotelReservation.Season.*;

public class PriceCalculator {
    public static double calculate(double pricePerDay, int numberOfDays, String season, String discountType) {
        double result = 0;

        switch (season) {
            case "Autumn":
                pricePerDay *= AUTUMN.getMultiplier();
                break;
            case "Spring":
                pricePerDay *= SPRING.getMultiplier();
                break;
            case "Winter":
                pricePerDay *= WINTER.getMultiplier();
                break;
            case "Summer":
                pricePerDay *= SUMMER.getMultiplier();
                break;
        }

        result = pricePerDay * numberOfDays;

        switch (discountType) {
            case "VIP":
                result *= VIP.getDiscount();
                break;
            case "SecondVisit":
                result *= SECONDVISIT.getDiscount();
                break;
        }

        return result;
    }


}
