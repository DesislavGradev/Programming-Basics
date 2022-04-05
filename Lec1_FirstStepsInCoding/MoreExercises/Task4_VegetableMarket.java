package Lec1_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Task4_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int vegKg = Integer.parseInt(scanner.nextLine());
        int fruitKg = Integer.parseInt(scanner.nextLine());
        double fruitValue = fruitPrice * fruitKg;
        double vegValue = vegPrice * vegKg;
        double totalValue = fruitValue + vegValue;

        System.out.printf("%.2f", totalValue / 1.94);
    }
}
