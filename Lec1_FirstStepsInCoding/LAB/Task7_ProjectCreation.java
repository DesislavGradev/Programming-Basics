import java.util.Scanner;

public class Task7_ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String archName = scanner.nextLine();
        int numberOfProjects = Integer.parseInt(scanner.nextLine());

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", archName , numberOfProjects * 3, numberOfProjects);
    }
}
