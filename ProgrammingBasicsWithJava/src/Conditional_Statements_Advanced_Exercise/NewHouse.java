package Conditional_Statements_Advanced_Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String kindOfFlowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int money = Integer.parseInt(scanner.nextLine());
        double price;
        double output = 0.0;

        switch (kindOfFlowers) {
            case "Roses":
                price = flowersCount * 5.00;
                if (flowersCount > 80) {
                    output = price - price * 10 / 100;
                } else {
                    output = price;
                }
                break;
            case "Dahlias":
                price = flowersCount * 3.80;
                if (flowersCount > 90) {
                    output = price - price * 15 / 100;
                } else {
                    output = price;
                }
                break;
            case "Tulips":
                price = flowersCount * 2.80;
                if (flowersCount > 80) {
                    output = price - price * 15 / 100;
                } else {
                    output = price;
                }
                break;
            case "Narcissus":
                price = flowersCount * 3.00;
                if (flowersCount < 120) {
                    output = price + price * 15 / 100;
                } else {
                    output = price;
                }
                break;
            case "Gladiolus":
                price = flowersCount * 2.50;
                if (flowersCount < 80) {
                    output = price + price * 20 / 100;
                } else {
                    output = price;
                }
                break;
        }
        if(money >= output){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowersCount,kindOfFlowers,money-output);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.",output-money);
        }
    }
}
