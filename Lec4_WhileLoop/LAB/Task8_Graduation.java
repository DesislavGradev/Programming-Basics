package Lec4_WhileLoop.LAB;

import java.util.Scanner;

public class Task8_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        double average = 0.00;
        int failed = 0;
        int grade = 1;
        while (grade <= 12) {
            double gradeScore = Double.parseDouble(scanner.nextLine());
            if (gradeScore < 4) {
                failed++;
            }
            if (failed > 1) {
                System.out.printf("%s has been excluded at %d grade", studentName, grade - 1);
                break;
            }
            average += gradeScore;
            grade++;
        }
        if (grade == 13) {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, average / 12);
        }
    }
}
