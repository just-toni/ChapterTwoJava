package Chapter2;
import java.util.Scanner;

public class ExerciseTwoPointThreeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value;
        System.out.println("enter a number e.g. 12345");
        value = input.nextInt();
        if (value >=10000 && value <=99999){
            int fifth = value%10;
            value = value/10;
            int fourth = value%10;
            value = value/10;
            int third = value%10;
            value = value/10;
            int second = value%10;
            value = value/10;
            System.out.println(value + " " + second + " " + third + " " + fourth + " "+ fifth);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
