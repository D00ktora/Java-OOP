/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 15.4.2023 г.
 * Time: 8:26
 */

package P02WorkingWithAbstractionExercise.P06GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] volt = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();
        long gold = 0;
        long stones = 0;
        long cash = 0;

        for (int i = 0; i < volt.length; i += 2) {
            String name = getItemName(volt[i]);
            long itemFromVolt = Long.parseLong(getItemName(getItemValue(volt, i)));
            String item = itemType(name);

            if (spaceInBackIsEnought(bagCapacity, bag, itemFromVolt, item)) continue;

            if (isThisItemFitableIntheBag(bag, itemFromVolt, item)) continue;

            createItemInBag(bag, name, item);
            addThisItemToTheBag(bag, name, itemFromVolt, item);
            
            if (item.equals("Gold")) {
                gold += itemFromVolt;
            } else if (item.equals("Gem")) {
                stones += itemFromVolt;
            } else if (item.equals("Cash")) {
                cash += itemFromVolt;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Long>> item : bag.entrySet()) {
            Long sumValues = getItemValue(item);
            printItem(item, sumValues);
        }
    }

    private static void printItem(Map.Entry<String, LinkedHashMap<String, Long>> item, Long sumValues) {
        System.out.println(String.format("<%s> $%s", item.getKey(), sumValues));

        item.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
    }

    private static long getItemValue(Map.Entry<String, LinkedHashMap<String, Long>> item) {
        return item.getValue().values().stream().mapToLong(l -> l).sum();
    }

    private static void addThisItemToTheBag(Map<String, LinkedHashMap<String, Long>> bag, String name, long itemFromVolt, String item) {
        bag.get(item).put(name, bag.get(item).get(name) + itemFromVolt); // put value of this item in bag
    }

    private static void createItemInBag(Map<String, LinkedHashMap<String, Long>> bag, String name, String item) {
        if (!bag.containsKey(item)) {
            bag.put(item, new LinkedHashMap<String, Long>()); // create item in bag
        }

        if (!bag.get(item).containsKey(name)) {
            bag.get(item).put(name, 0L); // fill the item with 0
        }
    }

    private static boolean isThisItemFitableIntheBag(Map<String, LinkedHashMap<String, Long>> bag, long itemFromVolt, String item) {
        switch (item) {
            case "Gem":
                if (isItemFromVoltIsLessThenGoldInTheBag(bag, item, "Gold", itemFromVolt)) return true;
                break;
            case "Cash":
                if (isItemFromVoltIsLessThenGoldInTheBag(bag, item, "Gem", itemFromVolt)) return true;
                break;
        }
        return false;
    }

    private static boolean isItemFromVoltIsLessThenGoldInTheBag(Map<String, LinkedHashMap<String, Long>> bag, String item, String Gold, long itemFromVolt) {
        if (!bag.containsKey(item)) {
            if (isItemInAvoutMoreThenGold(bag, Gold, itemFromVolt)) return true;
        } else if (isThisItemMoreThenGoldAfterAdding(bag, item, itemFromVolt, Gold)) {
            return true;
        }
        return false;
    }

    private static boolean isThisItemMoreThenGoldAfterAdding(Map<String, LinkedHashMap<String, Long>> bag, String item, long itemFromVolt, String Gold) {
        return bag.get(item).values().stream().mapToLong(e -> e).sum() + itemFromVolt > bag.get(Gold).values().stream().mapToLong(e -> e).sum();
    }

    private static boolean isItemInAvoutMoreThenGold(Map<String, LinkedHashMap<String, Long>> bag, String Gold, long itemFromVolt) {
        if (bag.containsKey(Gold)) {
            if (itemFromVolt > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                return true;
            }
        } else {
            return true;
        }
        return false;
    }

    private static boolean spaceInBackIsEnought(long bagCapacity, Map<String, LinkedHashMap<String, Long>> bag, long itemFromVolt, String item) {
        if (item.equals("")) {
            return true;
        } else if (bagCapacity < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + itemFromVolt) {
            return true;
        }
        return false;
    }

    private static String getItemValue(String[] volt, int i) {
        return volt[i + 1];
    }

    private static String getItemName(String volt) {
        return volt;
    }

    private static String itemType(String name) {
        String item = "";
        if (name.length() == 3) {
            item = "Cash";
        } else if (name.toLowerCase().endsWith("gem")) {
            item = "Gem";
        } else if (name.toLowerCase().equals("gold")) {
            item = "Gold";
        } else {
            item = "";
        }
        return item;
    }
}