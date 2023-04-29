/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 8:30
 */
package P09_04WildFarm;

public class Mouse extends Mammal{

    public Mouse(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            super.setFoodEaten(food.getQuantity());
        } else {
            System.out.printf("Mice are not eating that type of food!%n", super.getAnimalType());
            super.setFoodEaten(0);
        }
    }

}
