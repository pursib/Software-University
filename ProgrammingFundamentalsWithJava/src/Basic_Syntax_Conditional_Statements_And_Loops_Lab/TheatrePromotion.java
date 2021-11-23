package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int ages = Integer.parseInt(scanner.nextLine());
        int price = 0;
        boolean isAgesValid = true;
        switch (dayType) {
            case "Weekday":
                if (ages >= 0 && ages <= 18) {
                    price = 12;
                } else if (ages > 18 && ages <= 64) {
                    price = 18;
                } else if (ages > 64 && ages <= 122) {
                    price = 12;
                } else {
                    isAgesValid = false;
                }
                break;
            case "Weekend":
                if (ages >= 0 && ages <= 18) {
                    price = 15;
                } else if (ages > 18 && ages <= 64) {
                    price = 20;
                } else if (ages > 64 && ages <= 122) {
                    price = 15;
                } else {
                    isAgesValid = false;
                }

                break;
            case "Holiday":
                if (ages >= 0 && ages <= 18) {
                    price = 5;
                } else if (ages > 18 && ages <= 64) {
                    price = 12;
                } else if (ages > 64 && ages <= 122) {
                    price = 10;
                } else {
                    isAgesValid = false;
                }
                break;
        }
        if (isAgesValid) {
            System.out.printf("%d$", price);
        } else {
            System.out.println("Error!");
        }


    }
}
