/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 29.4.2023 г.
 * Time: 18:00
 */
package P13ExceptionsAndErrorHandlingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 1;
        int end = 100;
        List<Integer> allInRange = new ArrayList<>();

        while (allInRange.size() < 10) {
            try {
                start = readNumber(start, end, scanner);
                allInRange.add(start);
            } catch (NumberFormatException ignored) {
                System.out.println("Invalid Number!");
            } catch (IllegalStateException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(allInRange.stream().map(String::valueOf).collect(Collectors.joining(", ")));
    }

    public static int readNumber(int start, int end, Scanner scanner) {
        int number = Integer.parseInt(scanner.nextLine());

        if (!(start < number && number < end)) {
            throw new IllegalStateException("Your number is not in range " + start + " - 100!");
        }
        return number;
    }
}
