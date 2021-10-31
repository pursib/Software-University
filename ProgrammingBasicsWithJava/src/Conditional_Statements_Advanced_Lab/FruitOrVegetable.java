package Conditional_Statements_Advanced_Lab;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("banana") || input.equals("apple") || input.equals("cherry") || input.equals("grapes") || input.equals("kiwi") || input.equals("lemon")) {
            System.out.println("fruit");
        } else if (input.equals("tomato") || input.equals("cucumber") || input.equals("carrot") || input.equals("pepper")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
