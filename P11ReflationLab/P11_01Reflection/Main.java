package P11ReflationLab.P11_01Reflection;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 28.4.2023 г.
 * Time: 18:18
 */

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class reflection = Reflection.class;

        System.out.println(reflection);
        Class supperclass = reflection.getSuperclass();
        System.out.println(supperclass);
        Class[] interfaces = reflection.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
        Object reflectionObject = reflection.getDeclaredConstructor().newInstance();
        System.out.println(reflectionObject);
    }
}
