package Conditional_Statements_Advanced_Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double product;
        String output = "";

        if (operator.equals("+")) {
            product = number1 + number2;
            if (product % 2 == 0) {
                output = String.format("%d %s %d = %.0f - even", number1, operator, number2, product);
            } else {
                output = String.format("%d %s %d = %.0f - odd", number1, operator, number2, product);
            }
        } else if (operator.equals("-")) {
            product = number1 - number2;
            if (product % 2 == 0) {
                output = String.format("%d %s %d = %.0f - even", number1, operator, number2, product);
            } else {
                output = String.format("%d %s %d = %.0f - odd", number1, operator, number2, product);
            }
        } else if (operator.equals("*")) {
            product = number1 * number2;
            if (product % 2 == 0) {
                output = String.format("%d %s %d = %.0f - even", number1, operator, number2, product);
            } else {
                output = String.format("%d %s %d = %.0f - odd", number1, operator, number2, product);
            }
        } else if (operator.equals("/")) {
            product = 1.0 * number1 / number2;
            if (number2 == 0) {
                output = String.format("Cannot divide %d by zero", number1);
            } else {
                output = String.format("%d %s %d = %.2f", number1, operator, number2, product);
            }
        } else if (operator.equals("%")) {
            product = 1.0 * number1 % number2;
            if (number2 == 0) {
                output = String.format("Cannot divide %d by zero", number1);
            } else {
                output = String.format("%d %s %d = %.0f", number1, operator, number2, product);
            }
        }
        System.out.println(output);
    }
}
