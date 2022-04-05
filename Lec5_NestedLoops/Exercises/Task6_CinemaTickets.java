package Lec5_NestedLoops.Exercises;

import java.util.Scanner;

public class Task6_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        int totalTickets = 0;
        int countStudent = 0;
        int countStandard = 0;
        int countKids = 0;
        while (!filmName.equals("Finish")) {
            int availableSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int takenSeats = 0;
            while (!ticketType.equals("End")) {
                takenSeats++;
                totalTickets++;
                switch (ticketType) {
                    case "student":
                        countStudent++;
                        break;
                    case "standard":
                        countStandard++;
                        break;
                    case "kid":
                        countKids++;
                        break;
                }
                if (availableSeats == takenSeats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", filmName, takenSeats * 1.00 / availableSeats * 100);
            filmName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", countStudent * 1.00 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", countStandard * 1.00 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", countKids * 1.00 / totalTickets * 100);
    }
}
