package Lec2_ConditionalStatements.Exercises;

import java.util.Scanner;

public class Task1_SumOfSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int totalTime = first + second + third;
        int min = totalTime / 60;
        int sec = totalTime % 60;

        if (sec < 10) {
            System.out.printf("%d:0%d", min, sec);
        } else {
            System.out.printf("%d:%d", min, sec);
        }
    }
}
