package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double pricePerOnePerson = 0;
        boolean isStudents = false;
        boolean isBusiness = false;
        boolean isRegular = false;
        switch (day){
            case "Friday":
                    if(groupType.equals("Students")){
                        isStudents = true;
                        pricePerOnePerson = 8.45;
                    }else if(groupType.equals("Business")){
                        isBusiness = true;
                        pricePerOnePerson = 10.90;
                    }else{
                        isRegular = true;
                        pricePerOnePerson = 15;
                    }
                break;
            case "Saturday":
                if(groupType.equals("Students")){
                    pricePerOnePerson = 9.80;
                    isStudents = true;
                }else if(groupType.equals("Business")){
                    isBusiness = true;
                    pricePerOnePerson = 15.60;
                }else{
                    isRegular = true;
                    pricePerOnePerson = 20;
                }
                break;
            case "Sunday":
                if(groupType.equals("Students")){
                    isStudents = true;
                    pricePerOnePerson = 10.46;
                }else if(groupType.equals("Business")){
                    isBusiness = true;
                    pricePerOnePerson = 16;
                }else{
                    isRegular = true;
                    pricePerOnePerson = 22.50;
                }
                break;
        }

        double middlePrice = pricePerOnePerson * peopleCount;
        double finalPrice = 0;

        if(isStudents && peopleCount>=30){
            finalPrice = middlePrice - (middlePrice*0.15);
        }else if(isBusiness && peopleCount >= 100){
            finalPrice = (peopleCount - 10) * pricePerOnePerson;
        }else if(isRegular && peopleCount >=10 && peopleCount <=20){
            finalPrice = middlePrice - (middlePrice*0.05);
        }else{
            finalPrice = middlePrice;
        }

        System.out.printf("Total price: %.2f",finalPrice);
    }
}
