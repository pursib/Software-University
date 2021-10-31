package Conditional_Statements_Advanced_Lab;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double years = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if(gender.equals("m") && years <16){
            System.out.println("Master");
        }else if(gender.equals("m") && years>= 16){
            System.out.println("Mr.");
        }
        if(gender.equals("f") && years < 16){
            System.out.println("Miss");
        }else if(gender.equals("f") && years>= 16){
            System.out.println("Ms.");
        }
    }
}
