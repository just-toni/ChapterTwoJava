package Chapter2;

import java.util.Scanner;

public class ExerciseTwoPointOneSeven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int sum;
        int product;
        int average;
        int smallestvalue;
        int largestvalue;
        int temp;

        System.out.println("input first integer");
        number1 = input.nextInt();
        largestvalue = number1;
        smallestvalue = number1;
        temp= number1;
        System.out.println("input second integer");
        number2 = input.nextInt();
        if(temp > number2) {
            smallestvalue = number2;
        }
        if(temp < number2) {
            largestvalue = number2;
        }
        temp = number2;
        System.out.println("input third interger");
        number3 = input.nextInt();
        if (temp > number3){
            smallestvalue = number3;
        }
        if(temp < number3){
            largestvalue = number3;
        }
        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        average = (number1 + number2 + number3) / 3;
        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Average is %d%n", average);
        System.out.printf("Largestvalue is %d%n", largestvalue);
        System.out.printf("Smallestvalue is %d%n", smallestvalue);
    }
}
