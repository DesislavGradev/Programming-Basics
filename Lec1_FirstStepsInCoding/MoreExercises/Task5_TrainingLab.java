package Lec1_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Task5_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double lengthCm = length * 100;
        double widthCm = width * 100 - 100;
        int workingSpots = (int) (Math.floor(lengthCm / 120) * Math.floor(widthCm / 70) - 3);

        System.out.printf("%d", workingSpots);
    }
}
