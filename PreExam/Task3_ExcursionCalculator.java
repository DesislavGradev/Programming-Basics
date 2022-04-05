package PreExam;

import java.util.Scanner;

public class Task3_ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double pricePerPerson = 0.00;
        boolean isSummer = false;
        boolean isWinter = false;
        if (peopleNumber <= 5) {
            switch (season) {
                case "spring":
                    pricePerPerson = 50.00;
                    break;
                case "summer":
                    pricePerPerson = 48.50;
                    isSummer = true;
                    break;
                case "autumn":
                    pricePerPerson = 60.00;
                    break;
                case "winter":
                    pricePerPerson = 86.00;
                    isWinter = true;
                    break;
            }
        } else {
            switch (season) {
                case "spring":
                    pricePerPerson = 48.00;
                    break;
                case "summer":
                    pricePerPerson = 45.00;
                    isSummer = true;
                    break;
                case "autumn":
                    pricePerPerson = 49.50;
                    break;
                case "winter":
                    pricePerPerson = 85.00;
                    isWinter = true;
                    break;
            }
        }
        double totalSum = peopleNumber * pricePerPerson;
        if (isSummer){
            totalSum *= 0.85;
        }
        if (isWinter) {
            totalSum *= 1.08;
        }
        System.out.printf("%.2f leva.", totalSum);
    }
}
