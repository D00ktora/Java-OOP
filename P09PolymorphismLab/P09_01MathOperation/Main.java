/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 23.4.2023 г.
 * Time: 7:57
 */
package P09PolymorphismLab.P09_01MathOperation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MathOperation math = new MathOperation();
        System.out.println(math.add(2, 2));
        System.out.println(math.add(3, 3, 3));
        System.out.println(math.add(4, 4, 4, 4));
    }

}
