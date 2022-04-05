package Lec1_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Task6_FishMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        int musselKg = Integer.parseInt(scanner.nextLine());
        double bonitoPrice = mackerelPrice * 1.60;
        double scadPrice = spratPrice * 1.80;
        double total = bonitoPrice * bonitoKg + scadPrice * scadKg + musselKg * 7.50;
        System.out.printf("%.2f", total);
    }
}