/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 20.4.2023 г.
 * Time: 20:55
 */
package P08InterfacesAndAbstractionExercises.P08_04FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String input = scanner.nextLine();
            int numberOfWords = input.split("\\s+").length;

            switch (numberOfWords) {
                case 3:
                    Rebel rebel = createRebel(input);
                    rebels.add(rebel);
                    break;
                case 4:
                    Citizen citizen = createCitizen(input);
                    citizens.add(citizen);
                    break;
            }
        }

        String name = scanner.nextLine();

        while (!name.contains("End")) {
            for (Rebel rebel : rebels) {
                if (rebel.getName().equals(name)) {
                    rebel.buyFood();
                }
            }
            for (Citizen citizen : citizens) {
                if (citizen.getName().equals(name)) {
                    citizen.buyFood();
                }
            }
            name = scanner.nextLine();
        }

        int sum = 0;

        int sum1 = rebels.stream().mapToInt(e -> e.getFood()).sum();
        int sum2 = citizens.stream().mapToInt(e -> e.getFood()).sum();
        sum = sum1 + sum2;

        System.out.println(sum);
    }



    private static Citizen createCitizen(String input) {
        String name = input.split("\\s+")[0];
        int age = Integer.parseInt(input.split("\\s+")[1]);
        String id = input.split("\\s+")[2];
        String birthDay = input.split("\\s+")[3];
        Citizen citizen = new Citizen(name, age, id, birthDay);
        return citizen;
    }

    private static Rebel createRebel(String input) {
        String name = input.split("\\s+")[0];
        int age = Integer.parseInt(input.split("\\s+")[1]);
        String group = input.split("\\s+")[2];
        Rebel rebel = new Rebel(name, age, group);
        return rebel;
    }
}
