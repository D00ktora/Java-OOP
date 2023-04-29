/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 15.4.2023 г.
 * Time: 10:04
 */
package P03EncapsulationLab._P04FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);
            Person current = new Person(name, lastName, age, salary);
            personList.add(current);
        }

        Team team = new Team("Black Eagles");

        for (Person person : personList) {
            team.addPlayer(person);
        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserved team have " + team.getReserveTeam().size() + " players");
    }
}
