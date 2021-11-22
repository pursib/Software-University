package Nested_Loops_Exercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        boolean isBigger=false;
        for (int rows = 1; rows <= n; rows++) {

            for (int cols = 1; cols <= rows; cols++) {
                number++;
                System.out.print(number + " ");
                if (number >= n) {
                    isBigger = true;
                    break;
                }
            }
            System.out.println();
            if(isBigger){
                break;
            }

        }
    }
}
