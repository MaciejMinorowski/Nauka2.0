package Zad13;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input text:");
        String text = input.nextLine();
        String cleanText = text.trim().replaceAll("[^a-zA-Z0-9 ]", "");
        StringBuilder builder = new StringBuilder();

        String[] splitText = cleanText.split("\s");

        for (String word : splitText) {
            word = word + " " + word + " ";
            builder.append(word);

        }
        String stutterText = builder.toString();

        System.out.println(stutterText);
    }
}
