/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 15.4.2023 г.
 * Time: 7:10
 */
package P02WorkingWithAbstractionExercise.P03CardsWithPower;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        CardRank cardRank = null;
        CardSuit cardSuit = null;

        switch (rank) {
            case "ACE":
                cardRank = CardRank.ACE;
                break;
            case "TWO":
                cardRank = CardRank.TWO;
                break;
            case "THREE":
                cardRank = CardRank.THREE;
                break;
            case "FOUR":
                cardRank = CardRank.FOUR;
                break;
            case "FIVE":
                cardRank = CardRank.FIVE;
                break;
            case "SIX":
                cardRank = CardRank.SIX;
                break;
            case "SEVEN":
                cardRank = CardRank.SEVEN;
                break;
            case "EIGHT":
                cardRank = CardRank.EIGHT;
                break;
            case "NINE":
                cardRank = CardRank.NINE;
                break;
            case "TEN":
                cardRank = CardRank.TEN;
                break;
            case "JAK":
                cardRank = CardRank.JACK;
                break;
            case "QUEEN":
                cardRank = CardRank.QUEEN;
                break;
            case "KING":
                cardRank = CardRank.KING;
                break;
        }

        switch (suit) {
            case "CLUBS":
                cardSuit = CardSuit.CLUBS;
                break;
            case "DIAMONDS":
                cardSuit = CardSuit.DIAMONDS;
                break;
            case "HEARTS":
                cardSuit = CardSuit.HEARTS;
                break;
            case "SPADES":
                cardSuit = CardSuit.SPADES;
                break;
        }
        Card card = new Card(cardRank, cardSuit);
        System.out.println(card);
    }
}
