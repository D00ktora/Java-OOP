/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 20.4.2023 г.
 * Time: 19:28
 */
package P07InterfacesAndAbstractionLab.P07_06Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Ferrari ferrari = new Ferrari(name);
        System.out.println(ferrari);
    }
}
