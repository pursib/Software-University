package First_Steps_In_Coding_Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int length = Integer.parseInt(scanner.nextLine());
         int width = Integer.parseInt(scanner.nextLine());
         int height = Integer.parseInt(scanner.nextLine());
         double percent = Double.parseDouble(scanner.nextLine());

         double tankVolume = length * width * height;
         double tankVolumeInLitters = tankVolume / 1000;

         double neededLitters = tankVolumeInLitters * (1 - (percent/100));
        System.out.println(neededLitters);
    }
}
