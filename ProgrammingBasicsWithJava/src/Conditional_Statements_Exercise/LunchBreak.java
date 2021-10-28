package Conditional_Statements_Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int restTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = Math.ceil(restTime * 0.12);
        double freeTime = Math.ceil(restTime * 0.25);


         int timeLeft = (int) (restTime - lunchTime -freeTime);

        if(timeLeft >= episodeTime){
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.",serialName,timeLeft-episodeTime);
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.",serialName,Math.abs(episodeTime-timeLeft));
        }
    }
}
