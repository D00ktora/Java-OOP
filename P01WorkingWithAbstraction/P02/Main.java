package P01WorkingWithAbstraction.P02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 14.4.2023 г.
 * Time: 9:56
 */

public class Main {
    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    private static class Rectangular{
        Point top;
        Point bottom;

        public Rectangular(Point top, Point bottom) {
            this.top = top;
            this.bottom = bottom;
        }

        public boolean contains(Point point) {
            if (point.getX() <= top.getX() && point.getX() >= bottom.getX()) {
                if (point.getY() >= bottom.getY() && point.getY() <= top.getY()) {
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> collect = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Point bottom = new Point(Integer.parseInt(collect.get(0)), Integer.parseInt(collect.get(1)));
        Point top = new Point(Integer.parseInt(collect.get(2)), Integer.parseInt(collect.get(3)));
        Rectangular rectangular = new Rectangular(top, bottom);

        int numberOfPointsToCheck = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfPointsToCheck; i++) {
            List<Integer> xy = Arrays.stream(scanner.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
            Point temp = new Point(xy.get(0), xy.get(1));
            System.out.println(rectangular.contains(temp));
        }
    }
}
