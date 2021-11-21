package For_Loop_Exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openedTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean isNoMoreSalary= false;

        for (int i = 0; i <openedTabs ; i++) {
            String siteName = scanner.next();

            if(siteName.equals("Facebook")){
                salary -= 150;
            }else if(siteName.equals("Instagram")){
                salary -= 100;
            }else if(siteName.equals("Reddit")){
                salary -=50;
            }
            if(salary <=0){
                isNoMoreSalary=true;
                break;
            }

        }

        if(isNoMoreSalary){
            System.out.println("You have lost your salary.");
        }else{
            System.out.println(salary);
        }
    }
}
