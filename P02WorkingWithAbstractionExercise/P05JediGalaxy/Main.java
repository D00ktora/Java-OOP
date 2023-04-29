package P02WorkingWithAbstractionExercise.P05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readInput(scanner.nextLine());
        int row = dimensions[0];
        int col = dimensions[1];
        int[][] matrix = new int[row][col];

        fillGalaxyWithStars(row, col, matrix);

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you"))
        {
            int[] ivoS = readInput(command);
            int[] evil = readInput(scanner.nextLine());
            int evilRow = evil[0];
            int evilCol = evil[1];

            evilDestroyStars(matrix, evilRow, evilCol);

            int xI = ivoS[0];
            int yI = ivoS[1];

            sum = jedyCollectStars(matrix, sum, xI, yI);

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static long jedyCollectStars(int[][] matrix, long sum, int xI, int yI) {
        while (xI >= 0 && yI < matrix[1].length)
        {
            if (xI >= 0 && xI < matrix.length && yI >= 0 && yI < matrix[0].length)
            {
                sum += matrix[xI][yI];
            }

            yI++;
            xI--;
        }
        return sum;
    }

    private static void evilDestroyStars(int[][] matrix, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0)
        {
            if (evilRow >= 0 && evilRow < matrix.length && evilCol >= 0 && evilCol < matrix[0].length)
            {
                matrix[evilRow] [evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static int[] readInput(String scanner) {
        return Arrays.stream(scanner.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillGalaxyWithStars(int row, int col, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                matrix[i][j] = value++;
            }
        }
    }
}
