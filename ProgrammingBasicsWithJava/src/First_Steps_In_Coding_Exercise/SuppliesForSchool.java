package First_Steps_In_Coding_Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPackagesOfPens = Integer.parseInt(scanner.nextLine());
        int countPackagesOfMarkers = Integer.parseInt(scanner.nextLine());
        int cleaningAgentLitters = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());;

        double pricePerPackageOfPens = 5.80;
        double pricePerPackageOfMarkers = 7.20;
        double pricePerLitterOfCleaningAgent = 1.20;

        double sumForPens = countPackagesOfPens * pricePerPackageOfPens;
        double sumForMarkers = countPackagesOfMarkers * pricePerPackageOfMarkers;
        double sumForCleaningAgent = cleaningAgentLitters * pricePerLitterOfCleaningAgent;

        double totalSum = sumForCleaningAgent + sumForMarkers + sumForPens;
        double discountCalculation = totalSum - (totalSum * (discount / 100));
        System.out.println(discountCalculation);
    }
}
