package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String output = "";
        if (number <= 2) {
            output = "baby";
        } else if (number <= 13) {
            output = "child";
        } else if (number <= 19) {
            output = "teenager";
        } else if (number <= 65) {
            output = "adult";
        } else {
            output = "elder";
        }

        System.out.println(output);
    }
}
