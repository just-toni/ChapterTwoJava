package Chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int one;
        int two;

        System.out.println("enter first number");
        one = input.nextInt();
        System.out.println("enter next number");
        two = input.nextInt();

        if (one %two == 0){
            System.out.println("The first number is an multiple of the next number");
        }
        if (one %two != 0) {
            System.out.println("The first number is not a multiple of the next number");
        }
    }
}
