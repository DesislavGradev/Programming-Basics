package Lec3_ForLoop.Exercises;

import java.util.Scanner;

public class Task8_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tourNum = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int tourPoints = 0;
        int finalPoints = startPoints;
        int wonTour = 0;

        for (int i = 1; i <= tourNum; i++) {
            String tourPosition = scanner.nextLine();
            switch (tourPosition){
                case "W":
                    tourPoints = 2000;
                    wonTour++;
                    break;
                case "F":
                    tourPoints = 1200;
                    break;
                case "SF":
                    tourPoints = 720;
                    break;
            }
            finalPoints += tourPoints;
        }
        System.out.printf("Final points: %d\n", finalPoints);
        System.out.printf("Average points: %.0f\n", Math.floor((finalPoints - startPoints) * 1.0 / tourNum));
        System.out.printf("%.2f%%", wonTour * 1.0 / tourNum * 100);
    }
}
