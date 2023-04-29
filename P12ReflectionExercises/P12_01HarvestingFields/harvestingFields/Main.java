package P12ReflectionExercises.P12_01HarvestingFields.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Class reflation = RichSoilLand.class;

		Field[] fields = reflation.getDeclaredFields();

		String command = scanner.nextLine();
		while (!"HARVEST".equals(command)) {

			switch (command) {
				case "private":
					printPrivate(fields);
					break;
				case "protected":
					printProtected(fields);
					break;
				case "public":
					printPublic(fields);
					break;
				case "all":
					printAll(fields);
					break;
			}


			command = scanner.nextLine();
		}
	}

	private static void printAll(Field[] fields) {
		for (Field field : fields) {
			int modifiers = field.getModifiers();
			if (Modifier.isPublic(modifiers)) {
				System.out.println("public " + field.getType().getSimpleName() + " " + field.getName());
			} else if (Modifier.isProtected(modifiers)) {
				System.out.println("protected " + field.getType().getSimpleName() + " " + field.getName());
			} else {
				System.out.println("private " + field.getType().getSimpleName() + " " + field.getName());
			}
		}
	}

	private static void printPublic(Field[] fields) {
		for (Field field : fields) {
			int modifiers = field.getModifiers();
			if (Modifier.isPublic(modifiers)) {
				System.out.println("public " + field.getType().getSimpleName() + " " + field.getName());
			}
		}
	}

	private static void printProtected(Field[] fields) {
		for (Field field : fields) {
			int modifiers = field.getModifiers();
			if (Modifier.isProtected(modifiers)) {
				System.out.println("protected " + field.getType().getSimpleName() + " " + field.getName());
			}
		}
	}

	private static void printPrivate(Field[] fields) {
		for (Field field : fields) {
			int modifiers = field.getModifiers();
			if (Modifier.isPrivate(modifiers)) {
				System.out.println("private " + field.getType().getSimpleName() + " " + field.getName());
			}
		}
	}
}
