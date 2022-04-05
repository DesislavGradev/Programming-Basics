package Lec1_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Task2_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", side * height / 2);
    }
}
