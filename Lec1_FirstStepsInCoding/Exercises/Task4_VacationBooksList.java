import java.util.Scanner;

public class Task4_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numDays = Integer.parseInt(scanner.nextLine());

        int hoursPerDay = pagesInBook / pagesPerHour / numDays;

        System.out.println(hoursPerDay);
    }
}
