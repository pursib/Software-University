package Conditional_Statements_Advanced_Lab;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.parseInt(scanner.nextLine());

        if(numb>= -100 && numb <=100 && numb !=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
