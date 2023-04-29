/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 17.4.2023 г.
 * Time: 6:21
 */
package P04EncapsulationExercises.P04_03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] people = scanner.nextLine().split(";");
        String[] products = scanner.nextLine().split(";");
        List<Person> personList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();

        try {
            for (int i = 0; i < people.length; i++) {
                String name = people[i].split("=")[0];
                double money = Double.parseDouble(people[i].split("=")[1]);
                Person person = new Person(name, money);
                personList.add(person);
            }

            for (int i = 0; i < products.length; i++) {
                String name = products[i].split("=")[0];
                double cost = Double.parseDouble(products[i].split("=")[1]);
                Product product = new Product(name, cost);
                productList.add(product);
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }

        String command = scanner.nextLine();
        try {
            while (!"END".equals(command)) {
                String name = command.split("\\s+")[0];
                String product = command.split("\\s+")[1];
                Person current = personList.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList()).get(0);
                Product currentProduct = productList.stream().filter(product1 -> product1.getName().equals(product)).collect(Collectors.toList()).get(0);
                current.buyProduct(currentProduct);
                command = scanner.nextLine();
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
