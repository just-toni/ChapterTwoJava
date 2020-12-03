package Chapter2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter first integer");
        number1 = input.nextInt();
        System.out.println("Enter second integer");
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("The first integer is larger");
        }
        if (number1 == number2) {
            System.out.println("They are equal");
        }
        if (number1 < number2){
            System.out.println("The second integer is larger");
        }
    }
}
