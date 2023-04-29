/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 17.4.2023 г.
 * Time: 7:14
 */
package P04EncapsulationExercises.P04_04PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pizzaInput[] = scanner.nextLine().split("\\s+");
        if (pizzaInput.length < 3) {
            System.out.println("Pizza name should be between 1 and 15 symbols.");
            return;
        }
        String pizzaName = pizzaInput[1];
        int numberOfToppings = Integer.parseInt(pizzaInput[2]);

        try {

            Pizza pizza = new Pizza(pizzaName, numberOfToppings);

            String doughInput = scanner.nextLine();
            String flowerType = doughInput.split("\\s+")[1];
            String bakingTechnic = doughInput.split("\\s+")[2];
            double weight = Double.parseDouble(doughInput.split("\\s+")[3]);
            Dough dough = new Dough(flowerType, bakingTechnic, weight);

            pizza.setDough(dough);

            String toppingInput = scanner.nextLine();
            if (numberOfToppings == 0) {
                System.out.println(pizza);
                return;
            }
            while (!toppingInput.equals("END")) {
                String toppingType = toppingInput.split("\\s+")[1];
                double toppingWeight = Double.parseDouble(toppingInput.split("\\s+")[2]);
                Topping topping = new Topping(toppingType, toppingWeight);

                pizza.addTopping(topping);

                toppingInput = scanner.nextLine();
            }

            System.out.println(pizza);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
