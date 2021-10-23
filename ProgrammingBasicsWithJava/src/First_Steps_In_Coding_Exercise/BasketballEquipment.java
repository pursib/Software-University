package First_Steps_In_Coding_Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int taxPerYear = Integer.parseInt(scanner.nextLine());

         double sneakersPrice =  taxPerYear - (taxPerYear * 0.40);
         double equipPrice = sneakersPrice - (sneakersPrice * 0.20);
         double ballPrice =  equipPrice /4;
         double accessoaries = ballPrice /5;
         double totalPrice = sneakersPrice + equipPrice + ballPrice + accessoaries + taxPerYear;
        System.out.println(totalPrice);
    }
}
