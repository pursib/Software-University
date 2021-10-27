package Conditional_Statements_Exercise;

import java.util.Scanner;

public class BonusScore {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());

            double bonusScore = 0;

            if (number <= 100) {
                bonusScore += 5;
            }else if(number<=1000){
                bonusScore = bonusScore + number * 0.2;
            }else{
                bonusScore = bonusScore + number* 0.1;
            }

            if(number % 2 == 0){
                bonusScore += 1;
            }
            if(number % 10 == 5){
                bonusScore = bonusScore +=2;
            }

            double totalScore = bonusScore + number;

            System.out.println(bonusScore);
            System.out.println(totalScore);
        }
    }