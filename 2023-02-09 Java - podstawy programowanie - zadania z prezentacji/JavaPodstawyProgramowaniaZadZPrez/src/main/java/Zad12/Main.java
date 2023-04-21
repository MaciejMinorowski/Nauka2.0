package Zad12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter text:");

        String text = input.nextLine();
        String spacesOnly = text.replaceAll("[^ ]", "");


        int numberOfSpaces = spacesOnly.length();

        System.out.println(text.length());
        System.out.println(numberOfSpaces);

        double percentOfSpaces = (double)numberOfSpaces / (double)text.length() * 100;

        System.out.println("Spacje stanowią: " + (int)percentOfSpaces + " procent znaków w tekście.");


    }
}
