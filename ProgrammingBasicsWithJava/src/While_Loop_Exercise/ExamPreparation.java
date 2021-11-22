package While_Loop_Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(scanner.nextLine());
        int poorGradesCount = 0;
        boolean isExecuted = false;
        int gradeSum = 0;
        int gradeCount=0;
        int problemNum=0;
        String problemName = scanner.nextLine();
        String currentProblemName= "";
        while (!problemName.equals("Enough")) {
            problemNum++;
            currentProblemName = problemName;
            int grade = Integer.parseInt(scanner.nextLine());
            gradeSum+=grade;
            gradeCount++;
            if (grade <= 4) {
                poorGradesCount++;
                if (poorGradesCount == poorGradesLimit) {
                    isExecuted = true;
                    break;
                }
            }
            problemName = scanner.nextLine();
        }
        double avrScore = 1.0*gradeSum/gradeCount;
        //print
        String output;
        if (isExecuted) {
            output = String.format("You need a break, %d poor grades.", poorGradesCount);
        } else {
            output = String.format("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s",avrScore,problemNum,currentProblemName);
        }

        System.out.println(output);
    }
}
