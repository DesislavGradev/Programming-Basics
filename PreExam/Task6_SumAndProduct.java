package PreExam;

import java.util.Scanner;

public class Task6_SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isReady = false;
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 9; l >= k; l--) {
                        if ((i + j + k + l == i * j * k * l) && n % 10 == 5) {
                            System.out.println(i + "" + j + "" + k + "" + l);
                            isReady = true;
                            break;
                        }
                        if ((i * j * k * l) / (i + j + k + l) == 3 && n % 3 == 0) {
                            System.out.println(l + "" + k + "" + j + "" + i);
                            isReady = true;
                            break;
                        }
                    }
                    if (isReady) {
                        break;
                    }
                }
                if (isReady){
                    break;
                }
            }
            if (isReady){
                break;
            }
        }
        if(!isReady) {
            System.out.println("Nothing found");
        }
    }
}
