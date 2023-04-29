/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 8:35
 */
package P09_04WildFarm;

public class Tiger extends Felime{
    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.livingRegion = livingRegion;
    }

    @Override
    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void setLivingRegion(String livingRegion) {
        this.livingRegion = super.getLivingRegion();
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            System.out.printf("%ss are not eating that type of food!%n", super.getAnimalType());
            this.setFoodEaten(0);
        } else {
            super.setFoodEaten(food.getQuantity());
        }
    }
}
