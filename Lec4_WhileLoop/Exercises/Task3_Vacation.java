package Lec4_WhileLoop.Exercises;

import java.util.Scanner;

public class Task3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = 0;
        boolean isSpender = false;
        int spendCount = 0;
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        while (neededMoney > currentMoney) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCount++;
            if (action.equals("spend")) {
                currentMoney -= money;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
                spendCount++;
                if (spendCount == 5) {
                    isSpender = true;
                    break;
                }
            } else if (action.equals("save")) {
                currentMoney += money;
                spendCount = 0;
            }
        }
        if (isSpender) {
            System.out.printf("You can't save the money.\n%d", daysCount);
        } else {
            System.out.printf("You saved the money for %d days.", daysCount);
        }

    }
}
