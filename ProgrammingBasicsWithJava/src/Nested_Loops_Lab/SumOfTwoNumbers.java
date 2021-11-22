package Nested_Loops_Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinationCount = 0;
        int numb1 =0;
        int numb2=0;
        boolean flag = false;
        boolean isFound=false;
        for (int i = start; i <= end; i++) {
            numb1=i;
            for (int j = start; j <= end; j++) {
                numb2=j;
                combinationCount++;
                if (i + j == magicNumber) {
                    isFound=true;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        String output;
        if(isFound){
            output=String.format("Combination N:%d (%d + %d = %d)", combinationCount, numb1, numb2, magicNumber);
        }else {
            output= String.format("%d combinations - neither equals %d",combinationCount,magicNumber);
        }
        System.out.println(output);
    }
}
