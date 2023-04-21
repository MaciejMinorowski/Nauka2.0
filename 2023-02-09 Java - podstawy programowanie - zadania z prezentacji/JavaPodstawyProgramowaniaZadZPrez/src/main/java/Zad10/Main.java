package Zad10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert positive integer:");
        int number = input.nextInt();
        int sumOfNumbers = 0;


        for (int i = 0; number > 0; i++){
            sumOfNumbers += number % 10;
            number = number / 10;

        }

        System.out.println("Sum of single digits in number is: " + sumOfNumbers);


    }

}

