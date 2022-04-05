package Lec2_ConditionalStatements.Exercises;

import java.util.Scanner;

public class Task7_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        int videoSum = videoCards * 250;
        double processorPrice = videoSum * 0.35;
        double ramPrice = videoSum * 0.10;

        double totalSum = videoSum + processorPrice * processors + ramPrice * ram;

        if (videoCards > processors) {
            totalSum *= 0.85;
        }

        if (budget >= totalSum) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }
    }
}
