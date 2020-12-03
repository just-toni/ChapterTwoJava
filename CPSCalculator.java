package Chapter2;

import java.util.Scanner;

public class CPSCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total miles per day ");
        int totalMilesPerDay = scanner.nextInt();
        System.out.println("Enter cost per litre of fuel");
        int costPerLitreOfFuel = scanner.nextInt();
        System.out.println("Enter average miles per litre");
        int averageMilesPerLitre = scanner.nextInt();
        System.out.println("Enter parking fees per day");
        int parkingFeesPerDay = scanner.nextInt();
        System.out.println("Enter tolls per day");
        int tollsPerDay = scanner.nextInt();
        int dailyDrivingCost = (totalMilesPerDay / averageMilesPerLitre) * costPerLitreOfFuel + parkingFeesPerDay + tollsPerDay;;
        System.out.println("The daily cost of driving is " + dailyDrivingCost);
    }
}
