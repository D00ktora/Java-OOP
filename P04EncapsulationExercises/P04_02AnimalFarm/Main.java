/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 17.4.2023 г.
 * Time: 6:09
 */
package P04EncapsulationExercises.P04_02AnimalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        try {
            Chicken chicken = new Chicken(name, age);
            System.out.println(chicken);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
