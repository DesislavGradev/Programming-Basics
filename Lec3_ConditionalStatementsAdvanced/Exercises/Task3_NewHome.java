package Lec3_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Task3_NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerAmount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double flowersPrice = 0.00;

        switch (flowerType) {
            case "Roses":
                flowersPrice = flowerAmount * 5.00;
                if (flowerAmount > 80) {
                    flowersPrice *= 0.90;
                }
                break;
            case "Dahlias":
                flowersPrice = flowerAmount * 3.80;
                if (flowerAmount > 90) {
                    flowersPrice *= 0.85;
                }
                break;
            case "Tulips":
                flowersPrice = flowerAmount * 2.80;
                if (flowerAmount > 80) {
                    flowersPrice *= 0.85;
                }
                break;
            case "Narcissus":
                flowersPrice = flowerAmount * 3.00;
                if (flowerAmount < 120) {
                    flowersPrice *= 1.15;
                }
                break;
            case "Gladiolus":
                flowersPrice = flowerAmount * 2.50;
                if (flowerAmount < 80) {
                    flowersPrice *= 1.20;
                }
                break;
        }
        if (budget >= flowersPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerAmount, flowerType, budget - flowersPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", flowersPrice - budget);
        }
    }
}
