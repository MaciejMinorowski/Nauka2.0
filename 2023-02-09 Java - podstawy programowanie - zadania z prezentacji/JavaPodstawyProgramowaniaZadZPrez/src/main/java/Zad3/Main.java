package Zad3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 integers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double x1 = 0;
        double x2 = 0;
        double delta = Math.pow(b,2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Delta is negative - no solutions available");
        } else if (delta == 0) {
            x1 = -b / ( 2 * a);
            System.out.println("Solution of quadratic equation is: " + x1);
        } else {
            x1 = (-b - Math.sqrt(delta))/ (2 * a);
            x2 = (-b + Math.sqrt(delta))/ (2 * a);
            System.out.println("There are two solutions for this quadratic equation: ");
            System.out.println("First " + x1);
            System.out.println("Second " + x2);



        }


    }
}
