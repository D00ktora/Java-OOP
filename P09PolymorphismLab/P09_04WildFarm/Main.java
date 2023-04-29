/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 8:25
 */
package P09_04WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Mammal> mammalList = new ArrayList<>();
        while (!"End".equals(input)) {
            String[] animalTokens = input.split("\\s+");
            Food food = null;
            Mammal mammal;

            String foodInput = scanner.nextLine();
            String[] foodTokens = foodInput.split("\\s+");
            String foodType = foodTokens[0];
            switch (foodType) {
                case "Vegetable":
                    food = new Vegetable(Integer.parseInt(foodTokens[1]));
                    break;
                case "Meat":
                    food = new Meat(Integer.parseInt(foodTokens[1]));
            }
            String animalType = animalTokens[0];
            String nameMouse = animalTokens[1];
            double mouseWeight = Double.parseDouble(animalTokens[2]);
            String moseLivingRegion = animalTokens[3];
            switch (animalType) {
                case "Mouse":
                    mammal = new Mouse(nameMouse, animalType, mouseWeight, Integer.parseInt(foodTokens[1]), moseLivingRegion);
                    try {
                        mammal.makeSound();
                        mammal.eat(food);
                        mammalList.add(mammal);
                        //System.out.println(mammal);
                    } catch (NullPointerException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "Zebra":
                    mammal = new Zebra(nameMouse, animalType, mouseWeight, Integer.parseInt(foodTokens[1]), moseLivingRegion);
                    try {
                        mammal.makeSound();
                        mammal.eat(food);
                        mammalList.add(mammal);
                       // System.out.println(mammal);
                    } catch (NullPointerException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "Cat":
                    String catBread = animalTokens[4];
                    mammal = new Cat(nameMouse, animalType, mouseWeight, Integer.parseInt(foodTokens[1]), moseLivingRegion, catBread);
                    try {
                        mammal.makeSound();
                        mammal.eat(food);
                        mammalList.add(mammal);
                        //System.out.println(mammal);
                    } catch (NullPointerException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "Tiger":
                    mammal = new Tiger(nameMouse, animalType, mouseWeight, Integer.parseInt(foodTokens[1]), moseLivingRegion);
                    try {
                        mammal.makeSound();
                        mammal.eat(food);
                        mammalList.add(mammal);
                        //System.out.println(mammal);
                    } catch (NullPointerException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (Mammal mammal : mammalList) {
            System.out.println(mammal);
        }
    }
}
