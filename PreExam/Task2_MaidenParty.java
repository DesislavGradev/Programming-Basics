package PreExam;

import java.util.Scanner;

public class Task2_MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partyPrice = Double.parseDouble(scanner.nextLine());
        int loveMessNumber = Integer.parseInt(scanner.nextLine());
        int waxRoseNumber = Integer.parseInt(scanner.nextLine());
        int keychainNuber = Integer.parseInt(scanner.nextLine());
        int cartoonNumber = Integer.parseInt(scanner.nextLine());
        int luckCharmsNumber = Integer.parseInt(scanner.nextLine());

        double totalProductsPrice = loveMessNumber * 0.60 + waxRoseNumber * 7.20 + keychainNuber * 3.60 + cartoonNumber * 18.20 +
                                    luckCharmsNumber * 22;
        if (loveMessNumber + waxRoseNumber + keychainNuber + cartoonNumber + luckCharmsNumber >= 25) {
            totalProductsPrice *= 0.65;
        }
        // разход за хостинг
        totalProductsPrice *= 0.90;

        if (totalProductsPrice >= partyPrice) {
            System.out.printf("Yes! %.2f lv left.", totalProductsPrice - partyPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", partyPrice - totalProductsPrice);
        }
    }
}
