package P02WorkingWithAbstractionExercise.P03CardsWithPower;

/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 15.4.2023 г.
 * Time: 7:10
 */
public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    CardSuit(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
