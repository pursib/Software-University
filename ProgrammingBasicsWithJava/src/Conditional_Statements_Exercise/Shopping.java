package Conditional_Statements_Exercise;


import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCardsCount * 250;
        double processorsPrice = (videoCardPrice * 0.35) * processorsCount;
        double ramPrice = (videoCardPrice * 0.10) * ramCount;

        double totalPrice = videoCardPrice + processorsPrice + ramPrice;

        if(videoCardsCount > processorsCount){
            totalPrice = totalPrice - (totalPrice * 0.15);
        }
        if(budget >= totalPrice){
            System.out.printf("You have %.2f leva left!",budget-totalPrice);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!",totalPrice-budget);
        }
    }
}
