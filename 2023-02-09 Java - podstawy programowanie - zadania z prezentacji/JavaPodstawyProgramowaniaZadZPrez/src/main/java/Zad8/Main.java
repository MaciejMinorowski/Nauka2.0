package Zad8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float userInput1 = getFirstFloat();
        float userInput2 = getSecondFloat();

        String operationType = getTypeOfOperation();

        float result = doMath(userInput1,userInput2,operationType);

        displayResult(result);
    }



    public static Float getFirstFloat() {
        System.out.println("Please enter first number");
        Scanner input = new Scanner(System.in);
        Float userInput1 = input.nextFloat();
        return userInput1;
    }

    public static Float getSecondFloat() {
        System.out.println("Please enter first number");
        Scanner input = new Scanner(System.in);
        Float userInput2 = input.nextFloat();
        return userInput2;
    }

    public static String getTypeOfOperation() {
        System.out.println("Please enter the type of operation: + , - , * , / ");
        Scanner input = new Scanner(System.in);
        String userInputOperation = input.nextLine();

        if (userInputOperation.equals("+") || userInputOperation.equals("-") || userInputOperation.equals("*") || userInputOperation.equals("/")){
            return userInputOperation;
        } else {
            System.out.println("Wrong operation chosen - addition chosen instead");
            return "+";
        }

    }

    public static Float doMath(float userInput1, float userInput2, String userInputOperation){

        switch (userInputOperation) {
            case "+":
                return userInput1 + userInput2;

            case "-":
                return userInput1 - userInput2;


            case "*":
                return userInput1 * userInput2;


            case "/":
                if (userInput2 == 0){
                    System.out.println("ERROR!!! You cannot divide by zero! Dividing by 1 instead");
                    return userInput1 / 1.0f;
                } else {
                    return userInput1 / userInput2;
                }

            default:
                System.out.println("Error");
                return userInput1 / 1.0f;
        }

    }

    public static void displayResult(float result){
        System.out.println("Calculation result: " + result);
    }


}



