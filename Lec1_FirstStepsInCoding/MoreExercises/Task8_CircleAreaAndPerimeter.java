package Lec1_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Task8_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f\n", Math.PI * Math.pow(radius, 2));
        System.out.printf("%.2f", 2 * Math.PI * radius);
    }
}
