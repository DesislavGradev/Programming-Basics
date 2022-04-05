package Lec3_ConditionalStatementsAdvanced.LAB;

import java.util.Scanner;

public class Task4_TitleAgeSex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        String title = "";
        switch (gender) {
            case "m":
                if (age >= 16) {
                    title = "Mr.";
                } else {
                    title = "Master";
                }
                break;
            case "f":
                if (age >= 16) {
                    title = "Ms.";
                } else {
                    title = "Miss";
                }
                break;
        }
        System.out.println(title);
    }
}
