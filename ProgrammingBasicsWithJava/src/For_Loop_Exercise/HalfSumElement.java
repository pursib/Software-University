package For_Loop_Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < input; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max) {
                max = number;
            }

        }
        sum -= max;
        if(sum == max){
            System.out.printf("Yes%nSum = %d",sum);
        }else{
            System.out.printf("No%nDiff = %d",Math.abs(sum-max));
        }
    }
}
