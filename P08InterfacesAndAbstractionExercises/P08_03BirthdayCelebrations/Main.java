/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 20.4.2023 г.
 * Time: 19:42
 */
package P08InterfacesAndAbstractionExercises.P08_03BirthdayCelebrations;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Birthable> birthables = new ArrayList<>();

        while (!"End".equals(input)) {

            String type = input.split("\\s+")[0];
            switch (type) {
                case "Citizen":
                    Citizen citizen = createCitizen(input);
                    birthables.add(citizen);
                    break;
                case "Robot":
                    Robot robot = createRobot(input);
                    break;
                case "Pet":
                    Pet pet = createPet(input);
                    birthables.add(pet);
                    break;
            }
            input = scanner.nextLine();
        }

        String date = scanner.nextLine();

        boolean isFound = false;
        for (Birthable birthable : birthables) {
            boolean equals = birthable.getBirthDate().endsWith(date);
            if (equals) {
                System.out.println(birthable.getBirthDate());
                isFound = true;
            }
        }


        if (!isFound) {
            System.out.println("<no output>");
        }
    }

    private static Pet createPet(String input) {
        String petName = input.split("\\s+")[1];
        String birthDate = input.split("\\s+")[2];
        Pet pet = new Pet(petName, birthDate);
        return pet;
    }

    private static Robot createRobot(String input) {
        String id = input.split("\\s+")[1];
        String model = input.split("\\s+")[2];
        Robot robot = new Robot(id, model);
        return robot;
    }

    private static Citizen createCitizen(String input) {
        String citizenName = input.split("\\s+")[1];
        int citizenAge = Integer.parseInt(input.split("\\s+")[2]);
        String citizenId = input.split("\\s+")[3];
        String citizenBirthdate = input.split("\\s+")[4];
        Citizen citizen = new Citizen(citizenName, citizenAge, citizenId, citizenBirthdate);
        return citizen;
    }
}
