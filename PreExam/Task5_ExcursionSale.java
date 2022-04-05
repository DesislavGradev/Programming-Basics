package PreExam;

import java.util.Scanner;

public class Task5_ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaExcursionNumber = Integer.parseInt(scanner.nextLine());
        int mountainExcursionNumber = Integer.parseInt(scanner.nextLine());
        String packageName = scanner.nextLine();
        int profit = 0;
        boolean isSold = false;
        while (!packageName.equals("Stop")) {
            if (packageName.equals("sea") && seaExcursionNumber == 0) {
                packageName = scanner.nextLine();
                continue;
            }
            if (packageName.equals("mountain") && mountainExcursionNumber == 0) {
                packageName = scanner.nextLine();
                continue;
            }
            if (packageName.equals("sea")) {
                profit += 680;
                seaExcursionNumber--;
            } else if (packageName.equals("mountain")) {
                profit += 499;
                mountainExcursionNumber--;
            }
            if (mountainExcursionNumber == 0 && seaExcursionNumber == 0) {
                isSold = true;
                break;
            }
            packageName = scanner.nextLine();
        }
        if (isSold) {
            System.out.println("Good job! Everything is sold.");
        }
        System.out.printf("Profit: %d leva.", profit);
    }
}
