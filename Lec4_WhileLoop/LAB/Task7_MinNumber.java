package Lec4_WhileLoop.LAB;

import java.util.Scanner;

public class Task7_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNum = Integer.MAX_VALUE;
        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            int number = Integer.parseInt(input);
            if (number < minNum){
                minNum = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}
