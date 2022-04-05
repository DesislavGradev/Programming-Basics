package Lec3_ForLoop.Exercises;

import java.util.Scanner;

public class Task4_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double savedMoney = 0.00;
        int toyNum = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney += i * 1.00 / 2 * 10 - 1;
            } else {
                toyNum += 1;
            }
        }
        int toyMoney = toyPrice * toyNum;
        savedMoney += toyMoney;
        if (washingMachinePrice <= savedMoney){
            System.out.printf("Yes! %.2f", savedMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - savedMoney);
        }
    }
}
