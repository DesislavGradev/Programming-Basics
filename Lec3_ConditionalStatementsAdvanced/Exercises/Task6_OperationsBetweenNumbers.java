package Lec3_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Task6_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int resultInt = 0;
        double resultDouble = 0.00;
        String evenOrOdd = "";

        switch (operator) {
            case "+":
            case "-":
            case "*":
                if (operator.equals("+")) {
                    resultInt = num1 + num2;
                } else if (operator.equals("-")) {
                    resultInt = num1 - num2;
                } else {
                    resultInt = num1 * num2;
                }
                if (resultInt % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", num1, operator, num2, resultInt, evenOrOdd);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    resultDouble = num1 * 1.00 / num2;
                    System.out.printf("%d %s %d = %.2f", num1, operator, num2, resultDouble);
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    resultInt = num1 % num2;
                    System.out.printf("%d %s %d = %d", num1, operator, num2, resultInt);
                }
                break;
        }
    }
}
