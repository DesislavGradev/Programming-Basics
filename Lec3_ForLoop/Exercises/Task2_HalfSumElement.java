package Lec3_ForLoop.Exercises;

import java.util.Scanner;

public class Task2_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int biggest = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (biggest < num) {
                biggest = num;
            }
            sum += num;
        }
        if (sum - biggest == biggest) {
            System.out.printf("Yes%nSum = %d", biggest);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - biggest - biggest));
        }
    }
}
