/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 17.4.2023 г.
 * Time: 6:21
 */
package P04EncapsulationExercises.P04_03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }
    public void buyProduct(Product product) {
        if (product.getCost() > this.money) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        } else {
            products.add(product);
            money -= product.getCost();
            System.out.printf("%s bought %s%n", this.name, product.getName());
        }
    }

    @Override
    public String toString() {
        if (this.products.size() < 1) {
            return String.format("%s – Nothing bought", this.name);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%s - ", this.name));
        builder.append(this.products.stream().map(Product::getName).collect(Collectors.joining(", ")));
        return builder.toString().trim();
    }
}
