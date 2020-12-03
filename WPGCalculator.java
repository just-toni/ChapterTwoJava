package Chapter2;

import java.util.Scanner;

public class WPGCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double population = 780000000;
        double populationRate = 1.05/100;
        double newPopulation;

        System.out.printf("The world's current population is %.3f%n", population);
        newPopulation = population * populationRate;
        population = newPopulation + population;
        System.out.printf("The world's population after one year is %.3f%n", population);
        newPopulation = population * populationRate;
        population = newPopulation + population;
        System.out.printf("The world's current population after two years is %.3f%n", population);
        newPopulation = population * populationRate;
        population = newPopulation + population;
        System.out.printf("The world's current population after three years is %.3f%n", population);
        newPopulation = population * populationRate;
        population = newPopulation + population;
        System.out.printf("The world's current population after four years is %.3f%n", population);
        newPopulation = population * populationRate;
        population = newPopulation + population;
        System.out.printf("The world's current population after five years is %.3f%n", population);
    }
}
