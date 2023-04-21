package Zad15;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 integers:");

        int[] numbers = new int[10];
        HashMap<Integer, Integer> numbersRepeated = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

//         for(int number: numbers){
//            System.out.println(number);
//         }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (j != i && numbers[j] == numbers[i]) {
                    if (numbersRepeated.containsKey(numbers[j])) {
                        break;
                    } else {
                        numbersRepeated.put(numbers[j], 1);
                        System.out.println(numbers[j]);
                    }
                }
            }
        }
    }
}