package Zad20;

import java.util.Random;
import java.util.Scanner;




/*

INPUT:
1. generate random number
2. choose difficulty
3. ask to guess number - input


LOGIC:
1. checking answer
2. number of lives and logic of losing them

OUTPUT:
1. giving hints if wrong
2. lose/win information
3. check lives output

*/




public class Main {
    public static void main(String[] args) {

    int mysteryNumber = getMysteryNumber();
//        System.out.println(mysteryNumber);

    String difficulty = chooseDifficulty();

    int numberOfLives = setLives(difficulty);


    String gameResult = gameLogic(numberOfLives,mysteryNumber);

    displayGameResult(gameResult);
    }




    public static int getMysteryNumber(){
        Random random = new Random();
        return random.nextInt(1,100);
    }

    public static String chooseDifficulty(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your difficulty: easy, medium or hard:");
        String difficulty;

        do {
            difficulty = input.nextLine();
            if (!difficulty.equals("easy") && !difficulty.equals("medium") && !difficulty.equals("hard")){
                System.out.println("Wrong difficulty chosen! Please input again: easy, medium or hard:");
            }

        } while (!difficulty.equals("easy") && !difficulty.equals("medium") && !difficulty.equals("hard"));
            return difficulty;

    }



    public static int setLives(String difficulty){

        int numberOfLives = 0;

        if (difficulty.equals("easy")){
            numberOfLives = 10;
        } else if (difficulty.equals("medium")){
            numberOfLives = 8;
        } else if (difficulty.equals("hard")){
            numberOfLives = 6;
        }
        return numberOfLives;

    }

    public static void displayLives(int numberOfLives){
        System.out.println(numberOfLives);
    }

    public static int playerGuess(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void displayGameResult(String gameResult) {
        if (gameResult.equals("WIN")) {
            System.out.println("!!!!! Congratulations !!!!!");
            System.out.println("!!!!!!!!! You WIN !!!!!!!!!");
        } else if (gameResult.equals("LOSE")) {
            System.out.println("!!!!! My condolences !!!!!");
            System.out.println("!!!!!!!! You LOSE !!!!!!!!");
        }
    }

    public static String gameLogic(int numberOfLives, int mysteryNumber) {

        for (; 0 < numberOfLives; numberOfLives--) {

            System.out.println("You have: " + numberOfLives + " lives.");
            System.out.println("Guess a number between 1 and 100:");
            int playerGuess = playerGuess();

            if (playerGuess == mysteryNumber) {
                return "WIN";
            } else if (playerGuess < mysteryNumber + 5 && playerGuess > mysteryNumber - 5) {
                System.out.println("BOILING HOT - in range of 5");
            } else if (playerGuess < mysteryNumber + 10 && playerGuess > mysteryNumber - 10) {
                System.out.println("HOT - in range of 10");
            } else if (playerGuess < mysteryNumber + 25 && playerGuess > mysteryNumber - 25) {
                System.out.println("WARM - in range of 25");
            } else if (playerGuess < mysteryNumber + 50 && playerGuess > mysteryNumber - 50) {
                System.out.println("CHILLY - in range of 50");
            } else if (playerGuess < mysteryNumber + 75 && playerGuess > mysteryNumber - 75) {
                System.out.println("COLD - in range of 75");
            } else if (playerGuess < mysteryNumber + 100 && playerGuess > mysteryNumber - 100) {
                System.out.println("FREEZING - in range of 100");
            }
        }
        return "LOSE";
    }














}


