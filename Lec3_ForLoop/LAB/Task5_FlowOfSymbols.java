package Lec3_ForLoop.LAB;

import java.util.Scanner;

public class Task5_FlowOfSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            System.out.println(text.charAt(i));
        }
    }
}
