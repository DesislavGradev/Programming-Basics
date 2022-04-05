package Lec3_ForLoop.LAB;

import java.util.Scanner;

public class Task7_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= numbersCount; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
