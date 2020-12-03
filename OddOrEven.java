package Chapter2;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number = input.nextInt();
        if(number %2 == 0){
            System.out.println("The number is an even number");
        }
        if (number %2 == 1){
            System.out.println("The number is an odd number");
        }
    }
}
