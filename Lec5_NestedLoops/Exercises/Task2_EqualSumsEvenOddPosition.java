package Lec5_NestedLoops.Exercises;

import java.util.Scanner;

public class Task2_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        int lengthInput1 = input1.length();

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        for (int i = num1; i <= num2; i++) {
            int currentNumber = i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = lengthInput1; j > 0; j--) {
                if (j % 2 == 0) {
                    evenSum += currentNumber % 10;
                    currentNumber /= 10;
                } else {
                    oddSum += currentNumber % 10;
                    currentNumber /= 10;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}

