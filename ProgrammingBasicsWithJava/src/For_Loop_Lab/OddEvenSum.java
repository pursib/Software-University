package For_Loop_Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;
        int numbCount=0;
        for (int i = 0; i < n; i++) {
            numbCount++;
            int numb = Integer.parseInt(scanner.nextLine());
            if (numbCount % 2 == 0) {
                evenSum += numb;
            }else{
                oddSum += numb;
            }

        }
        if(oddSum == evenSum){
            System.out.printf("Yes%nSum = %d",evenSum);
        }else{
            System.out.printf("No%nDiff = %d",Math.abs(oddSum-evenSum));
        }
    }
}
