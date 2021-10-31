package Conditional_Statements_Advanced_Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination;
        double price = 0.0;
        String typeOfJourney = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                typeOfJourney = "Camp";
                price = budget * 30 / 100;
            } else {
                typeOfJourney = "Hotel";
                price = budget * 70 / 100;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                typeOfJourney = "Camp";
                price = budget * 40 / 100;
            } else {
                typeOfJourney = "Hotel";
                price = budget * 80 / 100;
            }
        } else {
            destination = "Europe";
            if (season.equals("summer") || season.equals("winter")) {
                typeOfJourney = "Hotel";
                price = budget * 90 / 100;
            }
        }
        //print
        System.out.printf("Somewhere in %s%n%s - %.2f", destination, typeOfJourney, price);
    }
}
