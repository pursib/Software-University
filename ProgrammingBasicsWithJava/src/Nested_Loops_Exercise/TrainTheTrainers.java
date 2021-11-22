package Nested_Loops_Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int judgeCount = Integer.parseInt(scanner.nextLine());
        String lane = scanner.nextLine();
        double allGradesSum = 0.0;
        double presentationCounter=0.0;
        while (!lane.equals("Finish")) {
            presentationCounter++;
            String presentationName = lane;
            double gradesSum = 0.0;
            for (int i = 0; i < judgeCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradesSum += grade;

            }
            double avrGrade = gradesSum / judgeCount;
            allGradesSum += avrGrade;
            System.out.printf("%s - %.2f.%n", presentationName, avrGrade);


            lane = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",allGradesSum/presentationCounter);
    }
}
