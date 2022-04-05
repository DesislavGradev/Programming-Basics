package Lec4_WhileLoop.Exercises;

import java.util.Scanner;

public class Task2_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastProblem = "";
        double totalGrade = 0.00;
        int problelCount = 0;
        int failedCount = 0;
        boolean isFailed = false;
        int failsLimit = Integer.parseInt(scanner.nextLine());
        String problem = scanner.nextLine();
        while (!problem.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            totalGrade += grade;
            problelCount++;
            if (grade <= 4) {
                failedCount++;
            }
            if (failedCount == failsLimit) {
                isFailed = true;
                break;
            }
            lastProblem = problem;
            problem = scanner.nextLine();
        }

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", failedCount);
        } else {
            System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s", totalGrade / problelCount
                    , problelCount
                    , lastProblem);
        }
    }
}
