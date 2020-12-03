package Chapter2;

import java.util.Scanner;

public class ExerciseTwoPointThreeTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput;
        int secondInput;
        int thirdInput;
        int fourthInput;
        int fifthInput;
        int positiveInput = 0;
        int negativeInput = 0;
        int zeroInput = 0;
        System.out.println("enter first value");
        firstInput = scanner.nextInt();
        System.out.println("enter next value");
        secondInput = scanner.nextInt();
        System.out.println("enter next value");
        thirdInput = scanner.nextInt();
        System.out.println("enter next value");
        fourthInput = scanner.nextInt();
        System.out.println("enter next value");
        fifthInput = scanner.nextInt();
        if (firstInput > 0){
            positiveInput = positiveInput+1;
        }
        if (firstInput == 0){
            zeroInput = zeroInput+1;
        }
        if (firstInput < 0){
            negativeInput = negativeInput+1;
        }
        if (secondInput > 0){
            positiveInput = positiveInput+1;
        }
        if (secondInput == 0){
            zeroInput = zeroInput+1;
        }
        if (secondInput < 0){
            negativeInput = negativeInput+1;
        }
        if (thirdInput > 0){
            positiveInput = positiveInput+1;
        }
        if (thirdInput == 0){
            zeroInput = zeroInput+1;
        }
        if (thirdInput < 0){
            negativeInput = negativeInput+1;
        }
        if (fourthInput > 0){
            positiveInput = positiveInput+1;
        }
        if (fourthInput == 0){
            zeroInput = zeroInput+1;
        }
        if (fourthInput < 0){
            negativeInput = negativeInput+1;
        }
        if (fifthInput > 0){
            positiveInput = positiveInput+1;
        }
        if (fifthInput == 0){
            zeroInput = zeroInput+1;
        }
        if (fifthInput < 0){
            negativeInput = negativeInput+1;
        }
        System.out.printf("positiveInout is %d%nnegativeInput is %d%nzeroInput is %d%n", positiveInput, negativeInput, zeroInput);
    }
}
