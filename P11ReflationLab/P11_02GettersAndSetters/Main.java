package P11ReflationLab.P11_02GettersAndSetters;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 28.4.2023 г.
 * Time: 18:18
 */

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class reflection = Reflection.class;
        Set<Method> getters = new TreeSet<>(Comparator.comparing(Method::getName));
        Set<Method> setters = new TreeSet<>(Comparator.comparing(Method::getName));
        Method[] methods = reflection.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            if (method.getName().contains("set")) {
                setters.add(method);
            } else if (method.getName().contains("get")) {
                getters.add(method);
            }
        }

        for (Method getter : getters) {
            System.out.println(getter.getName() + " will return class " + getter.getReturnType().getName());
        }
        for (Method setter : setters) {
            System.out.println(setter.getName() + " and will set field of class " + setter.getParameterTypes()[0].getName());
        }
    }
}
