package Lec1_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Task10_WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degree = Double.parseDouble(scanner.nextLine());
        if (degree >= 5.00 && degree <= 11.90) {
            System.out.println("Cold");
        } else if (degree <= 14.90) {
            System.out.println("Cool");
        } else if (degree <= 20.00) {
            System.out.println("Mild");
        } else if (degree <= 25.90) {
            System.out.println("Warm");
        } else if (degree <= 35.00) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}
