package PreExam;

import java.util.Scanner;

public class Task4_ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computersNumber = Integer.parseInt(scanner.nextLine());
        double totalSales = 0.00;
        int totalRating = 0;
        for (int i = 1; i <= computersNumber; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            int rating = number % 10;
            int possibleSales = number / 10;
            double realSales = 0;
            switch (rating) {
                case 2:
                    break;
                case 3:
                    realSales = possibleSales * 0.50;
                    break;
                case 4:
                    realSales = possibleSales * 0.70;
                    break;
                case 5:
                    realSales = possibleSales * 0.85;
                    break;
                case 6:
                    realSales = possibleSales;
                    break;
            }
            totalSales += realSales;
            totalRating += rating;
        }
        System.out.printf("%.2f\n", totalSales);
        System.out.printf("%.2f", totalRating * 1.00 / computersNumber);
    }
}
