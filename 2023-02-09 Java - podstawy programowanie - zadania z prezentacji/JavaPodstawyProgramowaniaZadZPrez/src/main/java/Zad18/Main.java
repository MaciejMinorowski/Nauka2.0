package Zad18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter text:");
        String text = input.nextLine();



        Pattern pattern = Pattern.compile(" a+ psik ");
        Matcher matcher = pattern.matcher(text);



        System.out.println(matcher.find());







    }
}
