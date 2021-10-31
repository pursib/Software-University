package For_Loop_Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftSum = 0;
        int rightSum = 0;
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= input; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            leftSum += num;
        }
        for (int i = 1; i <= input; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            rightSum += num;
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", rightSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(rightSum - leftSum));
        }
    }
}
