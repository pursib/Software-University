package First_Steps_In_Coding_Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int chickenCount = Integer.parseInt(scanner.nextLine());
         int fishCount = Integer.parseInt(scanner.nextLine());
         int veganCount = Integer.parseInt(scanner.nextLine());

         double totalPriceChicken = chickenCount * 10.35;
         double totalPriceFish = fishCount * 12.40;
         double totalPriceVegan = veganCount * 8.15;

         double dessertPrice = (totalPriceChicken + totalPriceVegan + totalPriceFish) * 0.20;
         double finalPrice = totalPriceFish + totalPriceChicken + totalPriceVegan + dessertPrice + 2.50;
        System.out.println(finalPrice);
    }
}
