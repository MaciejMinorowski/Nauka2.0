package Zad9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter positive integer:");
        int number = input.nextInt();
        int width = 8;

        for (int i = 0; i < number; i++) {
            System.out.print("*      *");
        }

        System.out.println();

        for (int i = 0; i < number; i++) {
            System.out.print(" *    * ");
        }

        System.out.println();

        for (int i = 0; i < number; i++) {
            System.out.print("  *  *  ");
        }

        System.out.println();

        for (int i = 0; i < number; i++) {
            System.out.print("   **   ");
        }
    }
}


