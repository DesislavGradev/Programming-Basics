import java.util.Scanner;

public class Task7_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numChickenMenus = Integer.parseInt(scanner.nextLine());
        int numFishMenus = Integer.parseInt(scanner.nextLine());
        int numVegMenus = Integer.parseInt(scanner.nextLine());

        double middleSum = numChickenMenus * 10.35 + numFishMenus * 12.4 + numVegMenus * 8.15;
        double dessert = middleSum * 0.20 ;
        double totalSum = middleSum + dessert + 2.5;

        System.out.println(totalSum);
    }
}
