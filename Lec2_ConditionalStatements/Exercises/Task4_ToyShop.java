package Lec2_ConditionalStatements.Exercises;

import java.util.Scanner;

public class Task4_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrise = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double profit = 0.00;
        double total = puzzles * 2.60 + talkDolls * 3.00 + teddyBears * 4.10 + minions * 8.20 + trucks * 2.00;

        if (puzzles + talkDolls + teddyBears + minions + trucks >= 50) {
            total *= 0.75;
        }
        profit = total * 0.9;
        if (profit >= vacationPrise){
            System.out.printf("Yes! %.2f lv left.", profit - vacationPrise);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", vacationPrise - profit);
        }
    }
}
