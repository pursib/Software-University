package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 3; i <=100 ; i+=3) {
            System.out.println(i);
        }

    }
}
