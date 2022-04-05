package Lec3_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Task9_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String accommodation = scanner.nextLine();
        String evaluation = scanner.nextLine();
        double price = 0.00;

        switch (accommodation) {
            case "room for one person":
                price = (days - 1) * 18;
                break;
            case "apartment":
                price = (days - 1) * 25;
                if (days < 10) {
                    price *= 0.70;
                } else if (days < 15) {
                    price *= 0.65;
                } else {
                    price *= 0.50;
                }
                break;
            case "president apartment":
                price = (days - 1) * 35;
                if (days < 10) {
                    price *= 0.90;
                } else if (days < 15) {
                    price *= 0.85;
                } else {
                    price *= 0.80;
                }
                break;
        }
        if (evaluation.equals("positive")) {
            price *= 1.25;
        }else if (evaluation.equals("negative")){
            price *= 0.90;
        }
        System.out.printf("%.2f", price);
    }
}
