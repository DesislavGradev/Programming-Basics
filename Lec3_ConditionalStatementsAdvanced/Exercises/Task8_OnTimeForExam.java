package Lec3_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Task8_OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinute = Integer.parseInt(scanner.nextLine());
        int examTime = examHour * 60 + examMinute;
        int arriveTime = arriveHour * 60 + arriveMinute;

        if (arriveTime > examTime) {
            System.out.println("Late");
            if (arriveTime - examTime > 59) {
                System.out.printf("%d:%02d hours after the start", (arriveTime - examTime) / 60, (arriveTime - examTime) % 60);
            } else {
                System.out.printf("%d minutes after the start", arriveTime - examTime);
            }
        }
        if (arriveTime < examTime && examTime - arriveTime <= 30) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", examTime - arriveTime);
        }
        if (arriveTime < examTime && examTime - arriveTime > 30) {
            System.out.println("Early");
            if (examTime - arriveTime < 60) {
                System.out.printf("%d minutes before the start", examTime - arriveTime);
            } else {
                System.out.printf("%d:%02d hours before the start", (examTime - arriveTime) / 60, (examTime - arriveTime) % 60);
            }
        }
        if (examTime == arriveTime) {
            System.out.println("On time");
        }
    }
}

