package P11ReflationLab.P11_03HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

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
        Set<Field> fields = new TreeSet<>(Comparator.comparing(Field::getName));
        Method[] methods = reflection.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            if (method.getName().contains("set")) {
                setters.add(method);
            } else if (method.getName().contains("get")) {
                getters.add(method);
            }
        }

        Field[] field = reflection.getDeclaredFields();
        for (Field field1 : field) {
            fields.add(field1);
        }
        for (Field field1 : fields) {
            int modifiers = field1.getModifiers();
            if (!Modifier.isPrivate(modifiers)) {
                System.out.println(field1.getName() + " must be private!");
            }
        }

        for (Method getter : getters) {
            int modifiers = getter.getModifiers();
            if (!Modifier.isPublic(modifiers)) {
                System.out.println(getter.getName() + " have to be public!");
            }
        }

        for (Method setter : setters) {
            int modifiers = setter.getModifiers();
            if (!Modifier.isPrivate(modifiers)) {
                System.out.println(setter.getName() + " have to be private!");
            }
        }
    }
}
