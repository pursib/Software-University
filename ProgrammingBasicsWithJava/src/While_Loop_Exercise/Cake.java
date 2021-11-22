package While_Loop_Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int currentPeaces = length * width;
        boolean isFinished = false;

        String input = scanner.nextLine();
        while (!input.equals("STOP")){
            int cakePeaces = Integer.parseInt(input);
            currentPeaces -= cakePeaces;
            if(currentPeaces<=0){
                isFinished=true;
                break;
            }
            input= scanner.nextLine();
        }
        String output;
        if(isFinished){
            output = String.format("No more cake left! You need %d pieces more.",Math.abs(currentPeaces));
        }else{
            output = String.format("%d pieces are left.",currentPeaces);
        }
        System.out.println(output);
    }
}
