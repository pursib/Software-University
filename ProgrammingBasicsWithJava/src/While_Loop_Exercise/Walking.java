package While_Loop_Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int currentSteps =0;
        boolean isGoalReached = false;
        while (!line.equals("Going home")){
            int steps = Integer.parseInt(line);
            currentSteps +=steps;
            if(currentSteps>=10000){
                isGoalReached = true;
                break;
            }
            line= scanner.nextLine();
        }
        if(line.equals("Going home")){
            int lastSteps = Integer.parseInt(scanner.nextLine());
            currentSteps += lastSteps;
            if(currentSteps >=10000){
                isGoalReached = true;
            }


        }

        String output;
        if(isGoalReached){
            output= String.format("Goal reached! Good job!%n%d steps over the goal! ",currentSteps-10000);
        }else{
            output = String.format("%d more steps to reach goal.",Math.abs(10000-currentSteps));
        }
        System.out.println(output);
    }

}
