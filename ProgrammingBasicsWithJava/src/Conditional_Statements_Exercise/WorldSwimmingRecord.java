package Conditional_Statements_Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double record = Double.parseDouble(scanner.nextLine());
            double distance = Double.parseDouble(scanner.nextLine());
            double timePerOneMeter = Double.parseDouble(scanner.nextLine());

            double lag = Math.floor(distance / 15) * 12.5;
            double time = distance * timePerOneMeter + lag;
            if(time < record){
                System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",time);
            }else{
                System.out.printf("No, he failed! He was %.2f seconds slower.", time - record);
            }
        }
}
