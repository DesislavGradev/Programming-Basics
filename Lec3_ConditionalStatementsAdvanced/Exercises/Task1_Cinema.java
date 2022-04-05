package Lec3_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Task1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double income = 0.00;

        switch (type) {
            case "Premiere":
                income = rows * columns * 12.00;
                break;
            case "Normal":
                income = rows * columns * 7.50;
                break;
            case "Discount":
                income = rows * columns * 5.00;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}
