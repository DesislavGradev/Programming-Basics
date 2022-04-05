package Lec4_WhileLoop.LAB;

import java.util.Scanner;

public class Task5_AccountBlance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalSum = 0.00;
        while (!input.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(input);
            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f\n", sum);
            totalSum += sum;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
