package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int numberHolder = 0;
        int startNumber = 1;
        int factorial = 0;

        for (int i = 0; i < number.length(); i++) {
            int currentNumber = Integer.parseInt(String.valueOf(number.charAt(i)));
            for (int j = 1; j <= currentNumber; j++) {
                numberHolder = startNumber * j;
                startNumber = numberHolder;


            }
            factorial += startNumber;
            startNumber = 1;

        }

        if (String.valueOf(factorial).equals(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
