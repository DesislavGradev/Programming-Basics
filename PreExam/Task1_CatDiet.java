package PreExam;

import java.util.Scanner;

public class Task1_CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatPercent = Integer.parseInt(scanner.nextLine());
        int proteinPercent = Integer.parseInt(scanner.nextLine());
        int carbohydratePercent = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int waterPercent = Integer.parseInt(scanner.nextLine());

        double fatGrams = (fatPercent * 1.00 / 100 * totalCalories) / 9;
        double proteinGrams = (proteinPercent * 1.00 / 100 * totalCalories) / 4;
        double carbohydrateGrams = (carbohydratePercent * 1.00 / 100 * totalCalories) / 4;
        double foodWight = fatGrams + proteinGrams + carbohydrateGrams;
        double caloriesForGram = totalCalories / foodWight;

        System.out.printf("%.4f", (100 - waterPercent) * 1.00 / 100  * caloriesForGram);
    }
}
