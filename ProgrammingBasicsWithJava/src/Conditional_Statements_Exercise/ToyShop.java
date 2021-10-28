package Conditional_Statements_Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int teddyBearCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        int toysCount = puzzleCount + dollCount + teddyBearCount + minionsCount + trucksCount;
        double totalPrice = (puzzleCount * 2.6) + (dollCount * 3) + (teddyBearCount * 4.10) + (minionsCount * 8.2) + (trucksCount * 2);

        if (toysCount >= 50){
            totalPrice = totalPrice - (totalPrice * 0.25);
        }

        double budget = totalPrice - (totalPrice * 0.10);
        double moneyLeft = Math.abs(tripPrice-budget);
        if(budget >= tripPrice){
            System.out.printf("Yes! %.2f lv left.",moneyLeft);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",moneyLeft);
        }
    }
}
