import java.util.Scanner;

public class Task5_SchoolSuplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penPackets = Integer.parseInt(scanner.nextLine());
        int markerPackets = Integer.parseInt(scanner.nextLine());
        int boardCleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double sum = penPackets * 5.8 + markerPackets * 7.2 + boardCleaner * 1.2;
        double totalSum = sum - (discount * 1.0 / 100) * sum;
        System.out.println(totalSum);
    }
}
