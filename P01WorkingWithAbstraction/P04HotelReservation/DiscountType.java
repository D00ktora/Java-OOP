package P01WorkingWithAbstraction.P04HotelReservation;

/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 15.4.2023 г.
 * Time: 6:29
 */
public enum DiscountType {
    VIP(0.80),
    SECONDVISIT(0.90);

    private double discount;
    DiscountType(double price) {
        this.discount = price;
    }

    public double getDiscount() {
        return discount;
    }
}
