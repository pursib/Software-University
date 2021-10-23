package First_Steps_In_Coding_Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double squareMeters = Integer.parseInt(scanner.nextLine());
         double priceWithoutDiscount = squareMeters * 7.61;
         double discount = priceWithoutDiscount * 0.18;
         double priceWithDiscount = priceWithoutDiscount - discount;

         String output = String.format("The final price is: %.2f lv.%nThe discount is: %.2f lv.",priceWithDiscount,discount);
        System.out.println(output);
    }
}
