package Lec3_ForLoop.Exercises;

import java.util.Scanner;

public class Task1_NumTo1000End7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 1000; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
