package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());


        int numbersSum = 0;
        for (int i = firstNumber; i <= secondNumber ; i++) {
            numbersSum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum: " + numbersSum);
    }
}
