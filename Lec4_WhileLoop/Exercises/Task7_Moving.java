package Lec4_WhileLoop.Exercises;

import java.util.Scanner;

public class Task7_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpace = width * length * height;
        int boxes = 0;
        boolean outOfSpace = false;
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            boxes = Integer.parseInt(input);
            freeSpace -= boxes;
            if (freeSpace <= 0) {
                outOfSpace = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (outOfSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        } else {
            System.out.printf("%d Cubic meters left.", freeSpace);
        }
    }
}
