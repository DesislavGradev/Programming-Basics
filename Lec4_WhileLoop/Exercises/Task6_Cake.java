package Lec4_WhileLoop.Exercises;

import java.util.Scanner;

public class Task6_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakePiecesTotal = width * length;
        int guestPieces = 0;
        boolean cakeOver = false;
        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            guestPieces = Integer.parseInt(input);
            cakePiecesTotal -= guestPieces;
            if (cakePiecesTotal <= 0) {
                cakeOver = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (cakeOver) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePiecesTotal));
        } else {
            System.out.printf("%d pieces are left.", cakePiecesTotal);
        }
    }
}