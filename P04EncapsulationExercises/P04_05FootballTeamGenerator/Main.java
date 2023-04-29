/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 17.4.2023 г.
 * Time: 18:09
 */
package P04EncapsulationExercises.P04_05FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Team> teamList = new ArrayList<>();
        String input = scanner.nextLine();


        while (!input.equals("END")) {
            try {
                String command = input.split(";")[0];

                switch (command) {
                    case "Team":
                        String split[] = input.split(";");
                        if (split.length < 2) {
                            System.out.println("A name should not be empty.");
                            break;
                        }
                        String name = input.split(";")[1];
                        Team teamForCreate = new Team(name);
                        teamList.add(teamForCreate);
                        break;

                    case "Add":

                        boolean isExist = false;
                        for (Team team : teamList) {
                            String teamName = input.split(";")[1];

                            if (team.getName().equals(teamName)) {
                                String playerName = input.split(";")[2];
                                int endurance = Integer.parseInt(input.split(";")[3]);
                                int sprint = Integer.parseInt(input.split(";")[4]);
                                int dribble = Integer.parseInt(input.split(";")[5]);
                                int passing = Integer.parseInt(input.split(";")[6]);
                                int shooting = Integer.parseInt(input.split(";")[7]);
                                Player current = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                                team.addPlayer(current);
                                isExist = true;
                                break;
                            }
                        }

                        if (isExist) {
                            break;
                        }
                        System.out.printf("Team %s does not exist.%n", input.split(";")[1]);
                        break;

                    case "Remove":

                        boolean remove = false;
                        String teamNameForRemove = input.split(";")[1];
                        String playerForRemove = input.split(";")[2];
                        for (Team team : teamList) {
                            if (team.getName().equals(teamNameForRemove)) {
                                team.removePlayer(playerForRemove);
                                remove = true;
                                break;
                            }
                        }

                        if (remove) {
                            break;
                        }
                        System.out.printf("Player %s is not in %s team.%n", playerForRemove, teamNameForRemove);
                        break;

                    case "Rating":

                        boolean rating = false;
                        for (Team team : teamList) {
                            if (team.getName().equals(input.split(";")[1])) {
                                System.out.printf("%s - %d%n", team.getName(), Math.round(team.getRating()));
                                rating = true;
                                break;
                            }
                        }

                        if (rating) {
                            break;
                        }

                        System.out.printf("Team %s does not exist.%n", input.split(";")[1]);
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
                input = scanner.nextLine();
        }

    }
}
