package Lec3_ForLoop.Exercises;

import java.util.Scanner;

public class Task7_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupsNum = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;
        int musalaPeople = 0;
        int monblanPeople = 0;
        int kilimanjaroPeople = 0;
        int k2People = 0;
        int everestPeople = 0;


        for (int i = 1; i <= groupsNum; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleInGroup;
            if (peopleInGroup <= 5) {
                musalaPeople += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblanPeople += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimanjaroPeople += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2People += peopleInGroup;
            } else {
                everestPeople += peopleInGroup;
            }
        }
        System.out.printf("%.2f%%%n", musalaPeople * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", monblanPeople * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", kilimanjaroPeople * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n", k2People * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%", everestPeople * 1.0 / totalPeople * 100);
    }
}
