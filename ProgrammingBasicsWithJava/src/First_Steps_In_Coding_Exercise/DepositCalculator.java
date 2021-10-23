package First_Steps_In_Coding_Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double depositedSum = Double.parseDouble(scanner.nextLine());
         int timeOfDeposit = Integer.parseInt(scanner.nextLine());
         double yearPercent = Double.parseDouble(scanner.nextLine());

         double sum = depositedSum + timeOfDeposit * ((depositedSum * yearPercent)/1200);
        System.out.println(sum);
    }
}
