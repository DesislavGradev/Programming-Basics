package Lec3_ConditionalStatementsAdvanced.LAB;

import java.util.Scanner;

public class Task7_WorkTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        if (hour >= 10 && hour < 18 && !day.equals("Sunday")) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
