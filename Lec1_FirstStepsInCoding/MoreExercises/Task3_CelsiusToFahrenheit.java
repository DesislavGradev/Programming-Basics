package Lec1_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Task3_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", celsius * 9 / 5 + 32);
    }
}
