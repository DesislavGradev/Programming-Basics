package Lec3_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Task7_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int overnight = Integer.parseInt(scanner.nextLine());
        double stayPriceAp = 0.00;
        double stayPriceSt = 0.00;

        switch (month) {
            case "May":
            case "October":
                stayPriceAp = overnight * 65;
                stayPriceSt = overnight * 50;
                break;
            case "June":
            case "September":
                stayPriceAp = overnight * 68.70;
                stayPriceSt = overnight * 75.20;
                break;
            case "July":
            case "August":
                stayPriceAp = overnight * 77;
                stayPriceSt = overnight * 76;
                break;
        }
        if (overnight > 7 && overnight <= 14 && (month.equals("May") || month.equals("October"))) {
            stayPriceSt *= 0.95;
        } else if (overnight > 14 && (month.equals("May") || month.equals("October"))) {
            stayPriceSt *= 0.70;
        } else if (overnight > 14 && (month.equals("June") || month.equals("September"))) {
            stayPriceSt *= 0.80;
        }
        if (overnight > 14) {
            stayPriceAp *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv.%n", stayPriceAp);
        System.out.printf("Studio: %.2f lv.", stayPriceSt);
    }
}
