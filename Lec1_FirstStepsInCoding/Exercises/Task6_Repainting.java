import java.util.Scanner;

public class Task6_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintThinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double matterialSum = (nylon + 2) * 1.5 + paint * 1.1 * 14.5 + paintThinner * 5 + 0.4;
        double workersSum = matterialSum * 0.3 * hours;
        double totalSum = matterialSum + workersSum;

        System.out.println(totalSum);
    }
}
