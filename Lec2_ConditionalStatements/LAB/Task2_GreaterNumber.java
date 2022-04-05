package Lec2_ConditionalStatements.LAB;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Task2_GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (firstNum >= secondNum) {
            System.out.println(firstNum);
        } else {
            System.out.println(secondNum);
        }
    }
}
