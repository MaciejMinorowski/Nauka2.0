package Zad7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter positive integer:");

        int number = input.nextInt();



        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int fibonacciSum = 0;

        System.out.println(fibonacci1);
        System.out.println(fibonacci2);

        for(int i = 2; i < number; i++) {
            fibonacciSum = fibonacci1 + fibonacci2 ;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacciSum;

            System.out.println(fibonacciSum);

        }






    }
}
