package First_Steps_In_Coding_Lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String name = scanner.nextLine();
        System.out.println("Hello, " + name +"!");
    }
}
