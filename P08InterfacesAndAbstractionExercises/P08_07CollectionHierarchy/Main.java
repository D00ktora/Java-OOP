/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 7:37
 */
package P08InterfacesAndAbstractionExercises.P08_07CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();
        for (String s : input) {
            System.out.print(addCollection.add(s) + " ");
        }
        System.out.println();
        for (String s : input) {
            System.out.print(addRemoveCollection.add(s) + " ");
        }
        System.out.println();
        for (String s : input) {
            System.out.print(myList.add(s) + " ");
        }
        System.out.println();
        int numberOfRemoves = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfRemoves; i++) {
            System.out.print(addRemoveCollection.remove() + " ");
        }
        System.out.println();
        for (int i = 0; i < numberOfRemoves; i++) {
            System.out.print(myList.remove() + " ");
        }
        System.out.println();

    }
}
