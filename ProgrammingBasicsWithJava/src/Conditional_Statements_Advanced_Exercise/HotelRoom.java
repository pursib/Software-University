package Conditional_Statements_Advanced_Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mouth = scanner.nextLine();
        int nightNumb = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.0;
        double apartmentPrice = 0.0;
//check for mouth
        if (mouth.equals("May") || mouth.equals("October")) {
            studioPrice = 50 * nightNumb;
            if (nightNumb > 7 && nightNumb<=14) {
                studioPrice = studioPrice - studioPrice * 5 / 100;
            }
            if (nightNumb > 14) {
                studioPrice = studioPrice - studioPrice * 30 / 100;
            }

            apartmentPrice = 65 * nightNumb;
            if (nightNumb > 14) {
                apartmentPrice = apartmentPrice - apartmentPrice * 10 / 100;
            }

        } else if (mouth.equals("June") || mouth.equals("September")) {
            studioPrice = 75.20 * nightNumb;
            if (nightNumb > 14) {
                studioPrice = studioPrice - studioPrice * 20 / 100;
            }

            apartmentPrice = 68.70 * nightNumb;
            if (nightNumb > 14) {
                apartmentPrice = apartmentPrice - apartmentPrice * 10 / 100;
            }


        } else if (mouth.equals("July") || mouth.equals("August")) {
            studioPrice = 76 * nightNumb;

            apartmentPrice = 77 * nightNumb;
            if (nightNumb > 14) {
                apartmentPrice = apartmentPrice - apartmentPrice * 10 / 100;
            }

        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",apartmentPrice,studioPrice);
    }
}

