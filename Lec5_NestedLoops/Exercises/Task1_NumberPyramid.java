package Lec5_NestedLoops.Exercises;

import java.util.Scanner;

public class Task1_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean isBigger = false;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(current + " ");
                current++;
                if (current > n) {
                    isBigger = true;
                    break;
                }
            }
            if (isBigger){
                break;
            }
            System.out.println();
        }
    }
}
