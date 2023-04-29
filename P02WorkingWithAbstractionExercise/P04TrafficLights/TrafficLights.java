/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 15.4.2023 г.
 * Time: 7:42
 */
package P02WorkingWithAbstractionExercise.P04TrafficLights;

import static P02WorkingWithAbstractionExercise.P04TrafficLights.Lights.*;

public class TrafficLights {
    private Lights light;

    public TrafficLights(String light) {
        switch (light) {
            case "GREEN":
                this.light = GREEN;
                break;
            case "RED":
                this.light = RED;
                break;
            case "YELLOW":
                this.light = YELLOW;
        }
    }

    @Override
    public String toString() {
        return this.light.toString();
    }

    public void changeColor() {
        switch (light) {
            case RED:
                light = GREEN;
                break;
            case GREEN:
                light = YELLOW;
                break;
            case YELLOW:
                light = RED;
                break;
        }
    }
}
