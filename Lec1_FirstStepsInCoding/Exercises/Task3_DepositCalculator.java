import java.util.Scanner;

public class Task3_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        double interestPerMonth = sum * (interest / 100) / 12;
        double totalSum = sum + period * interestPerMonth;

        System.out.println(totalSum);

    }
}
