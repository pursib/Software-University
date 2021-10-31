package Conditional_Statements_Advanced_Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());

        switch (city) {
            case "Sofia":
                if (s >= 0 && s <= 500) {
                    System.out.printf("%.2f", s * 5 / 100);
                } else if (s > 500 && s <= 1000) {
                    System.out.printf("%.2f", s * 7 / 100);
                } else if (s > 1000 && s <= 10000) {
                    System.out.printf("%.2f", s * 8 / 100);
                } else if (s > 10000) {
                    System.out.printf("%.2f", s * 12 / 100);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (s >= 0 && s <= 500) {
                    System.out.printf("%.2f", s * 4.5 / 100);
                } else if (s > 500 && s <= 1000) {
                    System.out.printf("%.2f", s * 7.5 / 100);
                } else if (s > 1000 && s <= 10000) {
                    System.out.printf("%.2f", s * 10 / 100);
                } else if (s > 10000) {
                    System.out.printf("%.2f", s * 13 / 100);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (s >= 0 && s <= 500) {
                    System.out.printf("%.2f", s * 5.5 / 100);
                } else if (s > 500 && s <= 1000) {
                    System.out.printf("%.2f", s * 8 / 100);
                } else if (s > 1000 && s <= 10000) {
                    System.out.printf("%.2f", s * 12 / 100);
                } else if (s > 10000) {
                    System.out.printf("%.2f", s * 14.5 / 100);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }
}