package Conditional_Statements_Advanced_Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double output;

        if (type.equals("Premiere")) {
            output = r*c*12;
            System.out.printf("%.2f leva",output);
        } else if (type.equals("Normal")) {
            output = r*c*7.50;
            System.out.printf("%.2f leva",output);
        } else if (type.equals("Discount")) {
            output= r*c*5;
            System.out.printf("%.2f leva",output);
        }
    }
}
