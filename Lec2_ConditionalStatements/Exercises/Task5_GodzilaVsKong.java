package Lec2_ConditionalStatements.Exercises;

import java.io.File;
import java.util.Scanner;

public class Task5_GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrise = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double clothesSum = statists * clothesPrise;
        if (statists > 150) {
            clothesSum *= 0.9;
        }
        double filmSum = clothesSum + decor;
        if (filmSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", filmSum - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - filmSum);
        }
    }
}
