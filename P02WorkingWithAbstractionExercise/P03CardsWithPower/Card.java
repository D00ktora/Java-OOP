/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 15.4.2023 г.
 * Time: 7:13
 */
package P02WorkingWithAbstractionExercise.P03CardsWithPower;


public class Card {
    CardRank cardRank;
    CardSuit cardSuit;

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.cardRank, this.cardSuit, calculatePower());
    }

    private int calculatePower() {
        return this.cardRank.getPower() + this.cardSuit.getPower();
    }
}
