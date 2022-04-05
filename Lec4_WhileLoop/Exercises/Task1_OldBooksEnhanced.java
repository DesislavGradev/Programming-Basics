package Lec4_WhileLoop.Exercises;

import java.util.Scanner;

public class Task1_OldBooksEnhanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        String neededBook = scanner.nextLine();
        String book = scanner.nextLine();
        boolean isFound = false;
        boolean rightAway = false;
        while (!book.equals("No More Books")) {
            if (book.equals(neededBook)) {
                isFound = true;
                break;
            }
            count++;
            book = scanner.nextLine();
        }
        if (isFound) {
            if (count == 0){
                System.out.println("You have found it right away!");
            } else{
                System.out.printf("You checked %d books and found it.", count);
            }
        } else if (count != 0){
            System.out.printf("The book you search is not here!\nYou checked %d books.", count);
        }

    }
}
