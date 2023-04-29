/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 17.4.2023 г.
 * Time: 20:31
 */
package P05InheritanceLab.P05_04StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data = new ArrayList<>();
    public void push(String item) {
        data.add(item);
    }
    public String pop() {
        String temp = data.get(data.size() - 1);
        data.remove(data.size() - 1);
        return temp;
    }
    public String peek() {
        return data.get(data.size() - 1);
    }
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
