import java.util.Scanner;

public class Task9_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeInDm = length * width * height * 0.001;
        double water = volumeInDm - volumeInDm * percent / 100;

        System.out.println(water);
    }
}
