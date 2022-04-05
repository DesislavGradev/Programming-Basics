package Lec5_NestedLoops.Exercises;

import java.util.Scanner;

public class Task4_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryNumber = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        int count = 0;
        double totalSumOfMarks = 0.00;
        while (!presentation.equals("Finish")) {
            double sumOfMarks = 0.00;
            for (int i = 1; i <= juryNumber; i++) {
                double mark = Double.parseDouble(scanner.nextLine());
                count++;
                totalSumOfMarks += mark;
                sumOfMarks += mark;
            }
            System.out.printf("%s - %.2f.\n", presentation, sumOfMarks / juryNumber);
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalSumOfMarks / count);
    }
}
