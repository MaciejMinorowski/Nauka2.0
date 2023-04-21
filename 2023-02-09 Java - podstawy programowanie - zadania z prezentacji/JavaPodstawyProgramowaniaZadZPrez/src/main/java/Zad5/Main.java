package Zad5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter positive integer:");
        int number = input.nextInt();
        boolean isPrimeNumber = true;

        for (int i = 2; i < number; i++){
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.println(i);



            }

            isPrimeNumber = true;
        }

    }
}
