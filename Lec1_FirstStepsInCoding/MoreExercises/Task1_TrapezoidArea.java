package Lec1_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Task1_TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1 = Double.parseDouble(scanner.nextLine());
        double side2 = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", (side1 + side2) * height / 2);
    }
}
