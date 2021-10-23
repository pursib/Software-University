package First_Steps_In_Coding_Exercise;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int usd = Integer.parseInt(scanner.nextLine());
         double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}
