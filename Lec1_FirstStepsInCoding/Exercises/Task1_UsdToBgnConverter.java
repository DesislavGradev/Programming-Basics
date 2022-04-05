import java.util.Scanner;

public class Task1_UsdToBgnConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());

        System.out.println(usd * 1.79549);
    }
}
