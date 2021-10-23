package First_Steps_In_Coding_Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());
        int neededHours = projectsCount * 3;

        String output = String.format("The architect %s will need %d hours to complete %d project/s.",architectName,neededHours,projectsCount);
        System.out.println(output);
    }
}
