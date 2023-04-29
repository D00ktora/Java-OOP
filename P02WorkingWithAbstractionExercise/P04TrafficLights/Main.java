/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 15.4.2023 г.
 * Time: 7:41
 */
package P02WorkingWithAbstractionExercise.P04TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lights = scanner.nextLine().split("\\s+");

        List<TrafficLights> trafficLightsLights = new ArrayList<>();
        for (int i = 0; i < lights.length; i++) {
            TrafficLights trafficLight = new TrafficLights(lights[i]);
            trafficLightsLights.add(trafficLight);
        }

        int numberOfUpdates = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfUpdates; i++) {
            for (TrafficLights trafficLightsLight : trafficLightsLights) {
                trafficLightsLight.changeColor();
                System.out.print(trafficLightsLight + " ");
            }
            System.out.println();
        }
    }
}
