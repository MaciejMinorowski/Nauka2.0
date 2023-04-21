package Zad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter positive integer");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++){
            if (i % 3 == 0 && i % 7 == 0){
                System.out.println("Pif paf");
            } else if (i % 3 == 0){
                System.out.println("Pif");
            } else if (i % 7 == 0){
                System.out.println("Paf");
            } else {
                System.out.println(i);
            }
        }



    }
}
