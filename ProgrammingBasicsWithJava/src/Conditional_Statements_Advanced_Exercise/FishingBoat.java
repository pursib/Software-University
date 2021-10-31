package Conditional_Statements_Advanced_Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());
        ;

        double shipPrice = 0.0;
        switch (season) {
            case "Spring":
                shipPrice = 3000;
            case "Summer":
                shipPrice = 4200;
                break;
            case "Autumn":
                shipPrice = 4200;
                break;
            case "Winter":
                shipPrice = 2600;
                break;
        }

        if (fishermanCount <= 6) {
            shipPrice = shipPrice - shipPrice * 0.10;
        }else if(fishermanCount <= 11){
            shipPrice = shipPrice - shipPrice* 0.15;
        }else{
            shipPrice = shipPrice - shipPrice * 0.25;
        }

        if(fishermanCount %2 == 0 && !season.equals("Autumn")){
            shipPrice = shipPrice - shipPrice * 0.05;
        }


        if(shipPrice <= budget){
            System.out.printf("Yes! You have %.2f leva left.",budget-shipPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",shipPrice-budget);
        }

    }
}
