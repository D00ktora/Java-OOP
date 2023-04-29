/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 15.4.2023 г.
 * Time: 7:01
 */
package P02WorkingWithAbstractionExercise.P01CardSuit;

public class Main {
    public static void main(String[] args) {
        CardSuit[] suits = CardSuit.values();

        System.out.println("Card Suits:");
        for (CardSuit suit : suits) {
            System.out.println("Ordinal value: " + suit.ordinal() + "; Name value: " + suit);
        }
    }
}
