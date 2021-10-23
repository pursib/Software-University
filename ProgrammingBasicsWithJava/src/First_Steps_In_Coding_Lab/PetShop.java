package First_Steps_In_Coding_Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int foodForDogsCount = Integer.parseInt(scanner.nextLine());
         int foodForCatsCount = Integer.parseInt(scanner.nextLine());
         double foodForDogsSum = foodForDogsCount * 2.50;
         int foodForCatsSum = foodForCatsCount * 4;
         double moneyNeeded = foodForCatsSum + foodForDogsSum;
        System.out.println(moneyNeeded +" lv.");
    }
}
