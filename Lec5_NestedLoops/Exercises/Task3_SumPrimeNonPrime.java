package Lec5_NestedLoops.Exercises;

import java.util.Scanner;

public class Task3_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            if (number != 2 && number != 3 && (number % 2 == 0 || number % 3 == 0)) {
                sumNonPrime += number;
            } else {
                sumPrime += number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\nSum of all non prime numbers is: %d", sumPrime, sumNonPrime);
    }
}
