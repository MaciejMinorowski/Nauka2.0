package Zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the diameter of circle:");
        float diameter = input.nextFloat();

        float circumference =(float)(2.0 * (diameter /2) * Math.PI);

        System.out.println(circumference);

    }
}
