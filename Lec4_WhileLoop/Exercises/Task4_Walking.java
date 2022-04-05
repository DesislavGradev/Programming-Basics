package Lec4_WhileLoop.Exercises;

import java.util.Scanner;

public class Task4_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int daySteps = 0;
        boolean isTired = false;
        while (daySteps < goal) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                isTired = true;
                int steps = Integer.parseInt(scanner.nextLine());
                daySteps += steps;
                break;
            }
            int steps = Integer.parseInt(input);
            daySteps += steps;
        }
        if (isTired) {
            if (daySteps >= goal) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", daySteps - goal);
            } else {
                System.out.printf("%d more steps to reach goal.", goal - daySteps);
            }
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", daySteps - goal);
        }
    }
}
