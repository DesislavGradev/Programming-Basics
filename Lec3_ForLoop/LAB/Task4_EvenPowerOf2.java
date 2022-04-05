package Lec3_ForLoop.LAB;

import java.util.Scanner;

public class Task4_EvenPowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= number; i += 2) {
            System.out.printf("%.0f%n", Math.pow(2, i));
        }
    }
}
