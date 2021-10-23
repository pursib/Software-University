package First_Steps_In_Coding_Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nailonPricePerMeter = 1.50;
        double paintPricePerLitter = 14.50;
        double paintAgentPricePerLitter = 5.00;

        int nailonCount = Integer.parseInt(scanner.nextLine());
        int paintLitters = Integer.parseInt(scanner.nextLine());
        int paintAgentLitters = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalPriceNailon = (nailonCount + 2) * nailonPricePerMeter;
        double totalPricePaint = (paintLitters + (paintLitters * 0.10)) * paintPricePerLitter;
        double totalPricePaintAgent = paintAgentPricePerLitter * paintAgentLitters;
        double totalSumForMaterials = totalPriceNailon + totalPricePaint + totalPricePaintAgent + 0.40;
        double sumForWorkers = (totalSumForMaterials * 0.30) * hours;
        double finalPrice = totalSumForMaterials + sumForWorkers;
        System.out.println(finalPrice);

    }
}
