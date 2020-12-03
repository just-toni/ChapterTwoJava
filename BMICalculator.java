package Chapter2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weight;
        double height;
        double BMI;

        System.out.println("input weight in kilograms");
        weight = input.nextInt();
        System.out.println("input height in metres");
        height = input.nextDouble();
        BMI = weight / (height * height);

        if (BMI < 18.5){
            System.out.println("You are underweight.");
        }
        if (BMI >= 18.5 && BMI <= 24.9){
            System.out.println("You are normal");
        }
        if (29.9 >= BMI && BMI >= 25){
            System.out.println("You are overweight");
        }
        if (BMI >= 30){
            System.out.println("You are obese");
        }
    }
}
