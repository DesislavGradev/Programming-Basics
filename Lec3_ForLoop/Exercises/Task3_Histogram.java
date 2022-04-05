package Lec3_ForLoop.Exercises;

import java.util.Scanner;

public class Task3_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1Sum = 0.00;
        double p2Sum = 0.00;
        double p3Sum = 0.00;
        double p4Sum = 0.00;
        double p5Sum = 0.00;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num >= 1 && num < 200) {
                p1Sum += 1;
            } else if (num < 400) {
                p2Sum += 1;
            } else if (num < 600) {
                p3Sum += 1;
            } else if (num < 800) {
                p4Sum += 1;
            } else {
                p5Sum++;
            }
        }
//        System.out.println((p1Sum / n * 100) + "%");
//        System.out.println((p2Sum / n * 100) + "%");
//        System.out.println((p3Sum / n * 100) + "%");
//        System.out.println((p4Sum / n * 100) + "%");
//        System.out.println((p5Sum / n * 100) + "%");
        System.out.printf("%.2f%%%n", p1Sum / n * 100);
        System.out.printf("%.2f%%%n", p2Sum / n * 100);
        System.out.printf("%.2f%%%n", p3Sum / n * 100);
        System.out.printf("%.2f%%%n", p4Sum / n * 100);
        System.out.printf("%.2f%%", p5Sum / n * 100);
    }
}
