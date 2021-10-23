package First_Steps_In_Coding_Exercise;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int pagesCount = Integer.parseInt(scanner.nextLine());
         int pagesPerHour = Integer.parseInt(scanner.nextLine());
         int days = Integer.parseInt(scanner.nextLine());

         int neededHours = pagesCount / pagesPerHour;
         int neededHoursPerDay = neededHours / days;
        System.out.println(neededHoursPerDay);
    }
}
