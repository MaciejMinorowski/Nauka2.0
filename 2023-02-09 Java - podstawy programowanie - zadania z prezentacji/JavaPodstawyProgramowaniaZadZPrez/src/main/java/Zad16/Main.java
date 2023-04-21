package Zad16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 integers:");
        int[] numbers = new int[10];
        int longestRise = 0;
        int checkRise = 0;

        for(int i = 0; i < numbers.length ; i++) {
            numbers[i] = input.nextInt();
        }

        for(int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i-1]){
                    checkRise++;
            } else {
                if (checkRise > longestRise) {
                    longestRise = checkRise;
                }
                checkRise = 0;
            }
        }
        System.out.println("Longest continuous rise of numbers equals: " + longestRise);





    }
}
