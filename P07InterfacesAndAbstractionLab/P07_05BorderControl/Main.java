/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 20.4.2023 г.
 * Time: 18:52
 */
package P07InterfacesAndAbstractionLab.P07_05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Identifiable> identifiables = new ArrayList<>();

        while (!"End".equals(input)) {
            int toSwitch = input.split("\\s+").length;

            switch (toSwitch) {
                case 3:
                    String name = input.split("\\s+")[0];
                    int age = Integer.parseInt(input.split("\\s+")[1]);
                    String citizenId = input.split("\\s+")[2];
                    Citizen citizen = new Citizen(name, age, citizenId);
                    identifiables.add(citizen);
                    break;
                case 2:
                    String robotId = input.split("\\s+")[1];
                    String model = input.split("\\s+")[0];
                    Robot robot = new Robot(robotId, model);
                    identifiables.add(robot);
                    break;
            }

            input = scanner.nextLine();
        }

        String idToFind = scanner.nextLine();

        for (Identifiable identifiable : identifiables) {
            boolean match = identifiable.getId().endsWith(idToFind);

            if (match) {
                System.out.println(identifiable.getId());
            }
        }
    }
}
