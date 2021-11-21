package While_Loop_Lab;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int numb = 1;

        while (numb <= n) {
            System.out.println(numb);
            numb = numb * 2 + 1;
        }

    }
}
