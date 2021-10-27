package Conditional_Statements_Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice= budget* 0.10;
        if(people > 150){
            clothesPrice = clothesPrice * 0.90;
        }
        double totalExpenses = clothesPrice * people + decorPrice;
        String output;
        if(budget >= totalExpenses){
            output = String.format("Action!%n " +
                    "Wingard starts filming with %.2f leva left.", budget-totalExpenses);
        }else{
            output = String.format("Not enough money!%n " +
                    "Wingard needs %.2f leva more.", totalExpenses-budget);
        }
        System.out.println(output);
    }
}
