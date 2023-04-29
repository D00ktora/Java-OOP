package P12ReflectionExercises.P12_02BlackBoxInteger.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, NoSuchMethodException {
        Scanner scanner = new Scanner(System.in);
        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        Method[] methods = clazz.getDeclaredMethods();
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBox = constructor.newInstance();
        Field hiddenValue = clazz.getDeclaredField("innerValue");
        hiddenValue.setAccessible(true);
        String command = scanner.nextLine();

        while (!"END".equals(command)) {
            String commandType = command.split("_")[0];
            int number = Integer.parseInt(command.split("_")[1]);
            Method method = getMethod(methods, commandType);
            assert method != null;
            method.setAccessible(true);
            method.invoke(blackBox, number);
            System.out.println(hiddenValue.get(blackBox));
            command = scanner.nextLine();
        }
    }

    private static Method getMethod(Method[] methods, String commandType) {
        Method addMethod;
        for (Method method : methods) {
            if (method.getName().contains(commandType)) {
                return method;
            }
        }
        return null;
    }
}
