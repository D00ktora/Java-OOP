/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 29.4.2023 г.
 * Time: 8:50
 */
package P13ExceptionsAndErrorHandlingLab;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            double sqrt = sqrt(input);
            System.out.printf("%.2f%n",sqrt);
        } catch (Exception ex) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }

    }

    private static double sqrt(String input) {
        int numer = Integer.parseInt(input);
        if (numer < 0) {
            throw new IllegalArgumentException("Invalid");
        }
        return Math.sqrt(numer);
    }
}
