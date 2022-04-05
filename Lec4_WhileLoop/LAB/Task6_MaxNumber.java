package Lec4_WhileLoop.LAB;

import java.util.Scanner;

public class Task6_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNum = Integer.MIN_VALUE;
        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            int number = Integer.parseInt(input);
            if (number > maxNum){
                maxNum = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
