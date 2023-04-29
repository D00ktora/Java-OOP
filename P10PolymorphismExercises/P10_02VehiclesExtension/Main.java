/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 18:54
 */
package P10PolymorphismExercises.P10_02VehiclesExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputCar = scanner.nextLine().split("\\s+");
        String[] inputTruck = scanner.nextLine().split("\\s+");
        String[] inputBus = scanner.nextLine().split("\\s+");

        Car car = makeCar(inputCar);
        Truck truck = makeTruck(inputTruck);
        Bus bus = makeBus(inputBus);


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
                    } else if (type.equals("Truck")) {
                        System.out.println(truck.driving(distance));
                    } else {
                        System.out.println(bus.driving(distance, 1.4));
                    }
                    break;
                case "Refuel":
                    if (type.equals("Car")) {
                        car.refueling(distance);
                    } else if (type.equals("Truck")) {
                        truck.refueling(distance);
                    } else {
                        bus.refueling(distance);
                    }
                    break;
                case "DriveEmpty":
                    System.out.println(bus.driving(distance));
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

    private static Bus makeBus(String[] inputBus) {
        double fuelQuantity = Double.parseDouble(inputBus[1]);
        double fuelConsumption = Double.parseDouble(inputBus[2]);
        double trunkCapacity = Double.parseDouble(inputBus[3]);
        Bus bus = new Bus(fuelQuantity, fuelConsumption, trunkCapacity);
        return bus;
    }

    private static Truck makeTruck(String[] inputTruck) {
        double fuelQuantity = Double.parseDouble(inputTruck[1]);
        double fuelConsumption = Double.parseDouble(inputTruck[2]);
        double trunkCapacity = Double.parseDouble(inputTruck[3]);
        Truck truck = new Truck(fuelQuantity, fuelConsumption, trunkCapacity);
        return truck;
    }

    private static Car makeCar(String[] inputCar) {
        double fuelQuantity = Double.parseDouble(inputCar[1]);
        double fuelConsumption = Double.parseDouble(inputCar[2]);
        double trunkCapacity = Double.parseDouble(inputCar[3]);
        Car car = new Car(fuelQuantity, fuelConsumption, trunkCapacity);
        return car;
    }
}
