package Lec3_ForLoop.LAB;

import java.util.Scanner;

public class Task8_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > biggest) {
                biggest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.printf("Max number: %d%n", biggest);
        System.out.printf("Min number: %d", smallest);
    }
}
