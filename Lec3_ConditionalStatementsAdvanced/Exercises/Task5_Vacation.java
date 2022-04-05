package Lec3_ConditionalStatementsAdvanced.Exercises;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task5_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double spendMoney = 0.00;
        String vacationType = "";

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    spendMoney = budget * 0.30;
                    vacationType = "Camp";
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    spendMoney = budget * 0.40;
                    vacationType = "Camp";
                } else {
                    destination = "Europe";
                    spendMoney = budget * 0.90;
                    vacationType = "Hotel";
                }
                break;
            case "winter":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    spendMoney = budget * 0.70;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    spendMoney = budget * 0.80;
                } else {
                    destination = "Europe";
                    spendMoney = budget * 0.90;
                }
                vacationType = "Hotel";
                break;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", vacationType, spendMoney);
    }
}
