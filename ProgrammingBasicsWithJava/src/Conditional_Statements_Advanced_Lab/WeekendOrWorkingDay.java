package Conditional_Statements_Advanced_Lab;

import java.util.Scanner;

public class WeekendOrWorkingDay {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String dayOfWeek = scanner.nextLine();
            if(dayOfWeek.equals("Monday")
                    || dayOfWeek.equals("Tuesday")
                    || dayOfWeek.equals("Wednesday")
                    || dayOfWeek.equals("Thursday")
                    || dayOfWeek.equals("Friday")){
                System.out.println("Working day");
            }else if (dayOfWeek.equals("Saturday")
                    || dayOfWeek.equals("Sunday")){
                System.out.println("Weekend");
            }else {
                System.out.println("Error");
            }
        }
}
