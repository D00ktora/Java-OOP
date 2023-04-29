/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 18:54
 */
package P10PolymorphismExercises.P10_01Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputCar = scanner.nextLine().split("\\s+");
        String[] inputTruck = scanner.nextLine().split("\\s+");

        Car car = makeCar(inputCar);
        Truck truck = makeTruck(inputTruck);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String token = scanner.nextLine();
            String command = token.split("\\s+")[0];
            String type = token.split("\\s+")[1];
            double distance = Double.parseDouble(token.split("\\s+")[2]);
            switch (command) {
                case "Drive":
                    if (type.equals("Car")) {
                        System.out.println(car.driving(distance));
                    } else {
                        System.out.println(truck.driving(distance));
                    }
                    break;
                case "Refuel":
                    if (type.equals("Car")) {
                        car.refueling(distance);
                    } else {
                        truck.refueling(distance);
                    }
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
    }

    private static Truck makeTruck(String[] inputTruck) {
        double fuelQuantity = Double.parseDouble(inputTruck[1]);
        double fuelConsumption = Double.parseDouble(inputTruck[2]);
        Truck truck = new Truck(fuelQuantity, fuelConsumption);
        return truck;
    }

    private static Car makeCar(String[] inputCar) {
        double fuelQuantity = Double.parseDouble(inputCar[1]);
        double fuelConsumption = Double.parseDouble(inputCar[2]);
        Car car = new Car(fuelQuantity, fuelConsumption);
        return car;
    }
}
