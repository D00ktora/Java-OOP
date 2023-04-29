/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 29.4.2023 г.
 * Time: 8:29
 */
package P13ExceptionsAndErrorHandlingLab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] range = scanner.nextLine().split(" ");
        int min = Integer.parseInt(range[0]);
        int max = Integer.parseInt(range[1]);
        System.out.printf("Range: [%d...%d]%n", min, max);
        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number >= min && number <= max) {
                    System.out.printf("Valid number: %d%n", number);
                    break;
                } else {
                    System.out.printf("Invalid number: %d%n", number);
                }
            } catch (IllegalArgumentException e) {
                System.out.printf("Invalid number: %s%n", input.trim());
            }
        }

    }
}
