package Lec2_ConditionalStatements.Exercises;

import java.util.Scanner;

public class Task6_SwimmingWorldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordTime = Double.parseDouble(scanner.nextLine());
        double recordDistance = Double.parseDouble(scanner.nextLine());
        double timeForMeter = Double.parseDouble(scanner.nextLine());

        double ivanTime = recordDistance * timeForMeter;
        double delayTime = Math.floor(recordDistance / 15) * 12.5;
        ivanTime += delayTime;
        if (recordTime <= ivanTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivanTime - recordTime);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        }
    }
}
