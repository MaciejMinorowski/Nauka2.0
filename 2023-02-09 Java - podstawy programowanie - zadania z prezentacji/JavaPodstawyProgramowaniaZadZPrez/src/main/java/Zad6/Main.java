package Zad6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter positive integer:");

        int number = input.nextInt();
        double sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + (1.0 /i);
        }

        System.out.println("Solution of harmonic series of " + number + " is: " + sum);
    }
}
