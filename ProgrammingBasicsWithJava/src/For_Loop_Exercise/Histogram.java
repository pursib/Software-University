package For_Loop_Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int totalNumbersCount = 0;
        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;
        for (int i = 1; i <=n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            totalNumbersCount++;
            if (number < 200) {
                p1Count++;
            } else if (number>= 200 && number <=399) {
                p2Count++;
            } else if (number >= 400 && number <= 599) {
                p3Count++;
            } else if (number >= 600 && number <= 799) {
                p4Count++;
            } else if (number >= 800) {
                p5Count++;
            }


        }
        totalNumbersCount = n;
        System.out.println();
        double p1Percent = 1.0 * p1Count / totalNumbersCount * 100;
        double p2Percent = 1.0 * p2Count / totalNumbersCount * 100;
        double p3Percent = 1.0 * p3Count / totalNumbersCount * 100;
        double p4Percent = 1.0 * p4Count / totalNumbersCount * 100;
        double p5Percent = 1.0 * p5Count / totalNumbersCount * 100;

        //print
        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
        System.out.printf("%.2f%%%n", p4Percent);
        System.out.printf("%.2f%%", p5Percent);
    }
}
