import java.util.Scanner;

public class Task9_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());

        double price = area * 7.61;
        double discount = price * 0.18;
        double finalPrice = price - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.printf("The discount is: " + discount + " lv.");
    }
}