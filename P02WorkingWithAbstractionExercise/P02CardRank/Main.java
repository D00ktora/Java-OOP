/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 15.4.2023 г.
 * Time: 7:06
 */
package P02WorkingWithAbstractionExercise.P02CardRank;

public class Main {
    public static void main(String[] args) {
        CardRank[] ranks = CardRank.values();

        System.out.println("Card Ranks:");
        for (CardRank rank : ranks) {
            System.out.println("Ordinal value: " + rank.ordinal() + "; Name value: " + rank);
        }
    }
}
