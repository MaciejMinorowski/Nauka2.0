package Zad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight:");
        float weight = input.nextFloat();
        System.out.println("Please input your height in cm:");
        int height = input.nextInt();
        float heightInMetres = height/100f;
        System.out.println(heightInMetres);

        float bmi = weight / (heightInMetres*heightInMetres);
        if (bmi >= 18.5 && bmi <=24.9){
            System.out.println("Your BMI is optimal and equals " + bmi);
        } else {
            System.out.println("Your BMI is not optimal and equals " + bmi);
        }
    }
}
