package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplayer = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            int result = multiplayer * i;
            System.out.printf("%d X %d = %d%n",multiplayer,i,result);
        }
    }
}
