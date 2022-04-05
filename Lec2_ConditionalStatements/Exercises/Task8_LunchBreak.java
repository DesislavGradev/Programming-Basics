package Lec2_ConditionalStatements.Exercises;

import java.util.Scanner;

public class Task8_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int episodeLenght = Integer.parseInt(scanner.nextLine());
        int totalBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = totalBreak / 8.0;
        double restTime = totalBreak / 4.0;

        double neededTime = episodeLenght + lunchTime + restTime;

        if (totalBreak >= neededTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    serialName, Math.ceil(totalBreak - neededTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    serialName, Math.ceil(neededTime - totalBreak));
        }
    }
}
