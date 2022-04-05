package Lec3_ForLoop.Exercises;

import java.util.Scanner;

public class Task6_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judgesNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= judgesNum; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            points += judgeName.length() * judgePoints / 2;
            if (points > 1250.5) {
                break;
            }
        }
        if (points <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - points);
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, points);
        }
    }
}
