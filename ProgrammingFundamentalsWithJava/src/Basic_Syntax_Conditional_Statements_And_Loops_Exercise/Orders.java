package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double total = 0.0;
        for (int i = 0; i < ordersCount; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double orderPrice = (days * capsulesCount) * pricePerCapsule;
            total += orderPrice;
            System.out.printf("The price for the coffee is: $%.2f", orderPrice);
        }
        System.out.println();
        System.out.printf("Total: $%.2f", total);
    }
}
