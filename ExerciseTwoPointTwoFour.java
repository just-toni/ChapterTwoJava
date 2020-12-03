package Chapter2;

import java.util.Scanner;

public class ExerciseTwoPointTwoFour {
    public static void main(String[] args) {
        Scanner dj = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int temp = 0;

        System.out.println("enter first number");
        number1 = dj.nextInt();
        if (number1 >= temp && number1 <= temp) {
            temp = number1;
        }
        System.out.println("enter second number");
        number2 = dj.nextInt();
        if (number2 >= temp) {
            temp = number2;
        }
        System.out.println("enter third number");
        number3 = dj.nextInt();
        if (number3 >= temp) {
            temp = number3;
        }
        System.out.println("enter fourth number");
        number4 = dj.nextInt();
        if (number4 >= temp) {
            temp = number4;
        }
        System.out.println("enter fifth number");
        number5 = dj.nextInt();
        if (number5 >= temp) {
            temp = number5;
        }
        System.out.println(temp);
        if (number1 <= temp) {
            temp = number1;
        }
        if (number2 <= temp) {
            temp = number2;
        }
        if (number3 <= temp) {
            temp = number3;
        }
        if (number4 <= temp) {
            temp = number4;
        }
        if (number5 <= temp) {
            temp = number5;
        }
        System.out.println(temp);
    }
}