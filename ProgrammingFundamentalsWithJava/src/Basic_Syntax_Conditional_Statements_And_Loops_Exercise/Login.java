package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        for (int i = username.length()-1; i >=0 ; i--) {
            password = password + username.charAt(i);
        }
        String passwordInput = scanner.nextLine();

        int loginTryCount = 0;

            boolean isLoginSuccessful = false;
        while (loginTryCount <=4){

            if(passwordInput.equals(password)){
                System.out.printf("User %s logged in.",username);
                isLoginSuccessful = true;
                break;
            }

            loginTryCount ++;
            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
            loginTryCount ++;

        }
        if(!isLoginSuccessful){

            System.out.printf("User %s blocked!",username);
        }

    }
}
