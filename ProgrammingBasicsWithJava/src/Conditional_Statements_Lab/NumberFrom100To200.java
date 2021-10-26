package Conditional_Statements_Lab;

import java.util.Scanner;

public class NumberFrom100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = Integer.parseInt(scanner.nextLine());


        if(numb < 100){
            System.out.println("Less than 100");
        }else if(numb <=200){
            System.out.println("Between 100 and 200");
        }else {
            System.out.println("Greater than 200");
        }

    }
}
