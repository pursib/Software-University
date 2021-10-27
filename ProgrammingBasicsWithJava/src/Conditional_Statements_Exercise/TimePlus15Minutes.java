package Conditional_Statements_Exercise;

import java.util.Scanner;

public class TimePlus15Minutes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int hour = Integer.parseInt(scanner.nextLine());
            int minutes = Integer.parseInt(scanner.nextLine());
            int currentMinutes = minutes + 15;
            if (currentMinutes>= 60){
                minutes = currentMinutes-60;
                hour++;
            }else{
                minutes = minutes+15;
            }
            if(hour>23){
                hour=0;
            }
            if(minutes<10){
                System.out.printf("%d:0%d",hour,minutes);
            }else{
                System.out.printf("%d:%d",hour,minutes);
            }
        }

    }
