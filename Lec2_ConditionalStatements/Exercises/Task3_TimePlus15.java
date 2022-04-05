package Lec2_ConditionalStatements.Exercises;

import java.util.Scanner;

public class Task3_TimePlus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (minutes < 45) {
            minutes += 15;
        } else if (hour == 23) {
            hour = 0;
            minutes -= 45;
        } else {
            hour += 1;
            minutes -= 45;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
