/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 8:16
 */
package P09PolymorphismLab.P09_03Animals;

public class Dog extends Animal{
    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.explainSelf()).append(System.lineSeparator());
        sb.append("DJAAF");
        return sb.toString().trim();
    }
}
