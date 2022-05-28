package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Money Insert
        double moneyInMachine = 0;
        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double money = Double.parseDouble(input);

            if (money != 0.1 && money != 0.2 && money != 0.5 && money != 1 && money != 2) {
                System.out.printf("Cannot accept %.2f%n", money);
            } else {
                moneyInMachine += money;
            }

            input = scanner.nextLine();
        }

        String productInput = scanner.nextLine();
        while (!productInput.equals("End")) {
            String product = productInput;
            switch (product) {
                case "Nuts":
                    if (moneyInMachine - 2 >= 0) {
                        moneyInMachine = moneyInMachine - 2;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry not enough money");
                    }
                    break;
                case "Water":
                    if (moneyInMachine - 0.7 >= 0) {
                        moneyInMachine = moneyInMachine - 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry not enough money");
                    }

                    break;
                case "Crisps":
                    if (moneyInMachine - 1.5 >= 0) {
                        moneyInMachine = moneyInMachine - 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry not enough money");
                    }

                    break;
                case "Soda":

                    if (moneyInMachine - 0.8 >= 0) {
                        moneyInMachine = moneyInMachine - 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry not enough money");
                    }
                    break;
                case "Coke":
                    if (moneyInMachine - 1 >= 0) {
                        moneyInMachine = moneyInMachine - 1;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            productInput = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", moneyInMachine);
    }


}
