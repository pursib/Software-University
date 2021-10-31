package Conditional_Statements_Advanced_Lab;
import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double output = 0.0;
        if(city.equals("Sofia")){
            if(product.equals("coffee")) {
                output = 0.50 * amount;
            }else if(product.equals("water")){
                output = 0.80 * amount;
            }else if(product.equals("beer")){
                output= 1.20 * amount;
            }else if(product.equals("sweets")){
                output = 1.45 * amount;
            }else if(product.equals("peanuts")){
                output= 1.60 * amount;
            }
        }else if(city.equals("Plovdiv")){
            if(product.equals("coffee")) {
                output = 0.40 * amount;
            }else if(product.equals("water")){
                output = 0.70 * amount;
            }else if(product.equals("beer")){
                output= 1.15 * amount;
            }else if(product.equals("sweets")){
                output = 1.30 * amount;
            }else if(product.equals("peanuts")){
                output= 1.50 * amount;
            }
        }else if(city.equals("Varna")){
            if(product.equals("coffee")) {
                output = 0.45 * amount;
            }else if(product.equals("water")){
                output = 0.70 * amount;
            }else if(product.equals("beer")){
                output= 1.10 * amount;
            }else if(product.equals("sweets")){
                output = 1.35 * amount;
            }else if(product.equals("peanuts")){
                output= 1.55 * amount;
            }
        }
        System.out.printf("%.2f",output);
    }
}

