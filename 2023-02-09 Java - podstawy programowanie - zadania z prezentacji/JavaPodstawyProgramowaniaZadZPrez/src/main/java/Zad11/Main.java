package Zad11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        String longestText = "";
        System.out.println("Please input texts how many you like. In order to end write: \"Starczy\"");

        do {
            text = input.nextLine();
            if (longestText.length() < text.length() && !text.equals("Starczy")) {
                longestText = text;
            }
        } while (!text.equals("Starczy"));

        if (longestText.equals("")){
            System.out.println("Nie podano żadnego tekstu");
        } else {
            System.out.println("Najdłuższy wpisany tekst to: " + longestText);
        }

    }
}
