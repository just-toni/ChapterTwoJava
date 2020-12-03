package Chapter2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float r;
        float diameter;
        float circumference;
        float area;
        double pi = Math.PI;
        System.out.println("enter value of r");
        r = input.nextFloat();
        diameter = 2*r;
        circumference = (float) (2*pi*r);
        area = (float) (pi*r*r);
        System.out.printf("Diameter is %.2f%n", diameter);
        System.out.printf("Circumference is %.2f%n", circumference);
        System.out.printf("Area is %.2f%n", area);
    }
}
