package Lec3_ConditionalStatementsAdvanced.LAB;

import java.util.Scanner;

public class Task5_LocalShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.00;
        if (product.equals("coffee") && city.equals("Sofia")) {
            price = quantity * 0.50;
        } else if (product.equals("coffee") && city.equals("Plovdiv")) {
            price = quantity * 0.40;
        } else if (product.equals("coffee") && city.equals("Varna")) {
            price = quantity * 0.45;
        }
        if (product.equals("water") && city.equals("Sofia")) {
            price = quantity * 0.80;
        } else if (product.equals("water") && city.equals("Plovdiv")) {
            price = quantity * 0.70;
        } else if (product.equals("water") && city.equals("Varna")) {
            price = quantity * 0.70;
        }
        if (product.equals("beer") && city.equals("Sofia")) {
            price = quantity * 1.20;
        } else if (product.equals("beer") && city.equals("Plovdiv")) {
            price = quantity * 1.15;
        } else if (product.equals("beer") && city.equals("Varna")) {
            price = quantity * 1.10;
        }
        if (product.equals("sweets") && city.equals("Sofia")) {
            price = quantity * 1.45;
        } else if (product.equals("sweets") && city.equals("Plovdiv")) {
            price = quantity * 1.30;
        } else if (product.equals("sweets") && city.equals("Varna")) {
            price = quantity * 1.35;
        }
        if (product.equals("peanuts") && city.equals("Sofia")) {
            price = quantity * 1.60;
        } else if (product.equals("peanuts") && city.equals("Plovdiv")) {
            price = quantity * 1.50;
        } else if (product.equals("peanuts") && city.equals("Varna")) {
            price = quantity * 1.55;
        }
        System.out.println(price);
    }
}
