package Lec1_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Task7_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double frontWall = x * x;
        double sideWall = x * y;
        double window = 1.50 * 1.50;
        double door = 1.20 * 2;
        double roofSide = x * y;
        double roofFront = x * h / 2;

        double greenPaint = (frontWall * 2 + sideWall * 2 - door - window * 2) / 3.40;
        double redPaint = (roofSide * 2 + roofFront * 2) / 4.30;

        System.out.printf("%.2f\n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
