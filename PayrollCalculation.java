package Chapter2;

import java.util.Scanner;

public class PayrollCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberb;
        int numberc;
        int product;
        System.out.println("enter first Integer");
        numberb = input.nextInt();
        System.out.println("enter second integer");
        numberc = input.nextInt();
        product = numberb * numberc;
        System.out.printf("Product is %d%n", product); // perform a payroll calculation sample
    }
}
