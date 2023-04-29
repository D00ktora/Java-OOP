/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 8:26
 */
package P09_04WildFarm;

public abstract class Food {
    private Integer quantity;

    protected Food(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
