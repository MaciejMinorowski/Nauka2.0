package Zad14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two small chars:");

        char smallLetter1 = input.next().charAt(0);
        char smallLetter2 = input.next().charAt(0);
        int numberOfCharsBetween = 0;

        if (smallLetter1 > smallLetter2) {
            numberOfCharsBetween = smallLetter1 - smallLetter2 - 1;
        } else {
            numberOfCharsBetween = smallLetter2 - smallLetter1 - 1;
        }

        System.out.println("There are " + numberOfCharsBetween + " letters between " + smallLetter1 + " and " + smallLetter2 );

    }
}
