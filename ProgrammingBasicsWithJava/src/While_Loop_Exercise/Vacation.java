package While_Loop_Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int daysSpendingIn=0;
        int allDays=0;


        while (vacationPrice > currentMoney) {
            allDays++;
            String operation = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            if (operation.equals("spend")) {
                currentMoney -= money;
                if(currentMoney <0){
                    currentMoney=0;
                }
                daysSpendingIn++;
                if(daysSpendingIn == 5){
                    break;
                }
            }else{
                currentMoney +=money;
                daysSpendingIn =0;
            }
        }

        String output;

        if(currentMoney>=vacationPrice){
            output = String.format("You saved the money for %d days.",allDays);
        }else {
            output= String.format("You can't save the money.%n" +
                    "%d",allDays);
        }
        System.out.println(output);

    }
}
