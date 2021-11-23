package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.parseInt(scanner.nextLine());
        int theMultiplayer = Integer.parseInt(scanner.nextLine());

        if(theMultiplayer>10){

            int product = numb * theMultiplayer;
            System.out.printf("%d X %d = %d",numb,theMultiplayer,product);
        }else{
            for (int i = theMultiplayer; i <=10 ; i++) {
                int product = numb * i;
                System.out.printf("%d X %d = %d%n",numb,i,product);

            }
        }
    }
}
