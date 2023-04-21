package TickTackToe;

/*
TO FIX:
1. checking if input during player move is valid - obsługa wyjątków
2. checking if player move do not land on previous move of player or computer
3. improving computer logic
4.

 */


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] board = generateBoard();
        String playerSymbol = chooseSymbol();
        String computerSymbol = setComputerSymbol(playerSymbol);

        gameplay(board, playerSymbol, computerSymbol);


    }

    public static String chooseSymbol() {
        String symbol;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please choose symbol: X or O");
            symbol = input.nextLine();
            if (!symbol.equals("X") && !symbol.equals("O")) {
                System.out.println("Wrong input. Try again...");
            }
        } while (!symbol.equals("X") && !symbol.equals("O"));
        return symbol;
    }

    public static String setComputerSymbol(String playerSymbol) {

        String computerSymbol;

        if (playerSymbol.equals("X")) {
            computerSymbol = "O";
        } else {
            computerSymbol = "X";
        }
        return computerSymbol;
    }

    public static String[][] generateBoard() {
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "*";
            }
        }
        return board;
    }


    public static void displayBoard(String[][] board) {

        System.out.println("------A---B---C--");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (j == 0) {
                    System.out.print(" " + (i + 1) + "  | ");
                }
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-----------------");
            System.out.println();
        }

    }

    public static String[][] playerTurn(String[][] board, String playerSymbol) {
        Scanner input = new Scanner(System.in);

        System.out.println("Player's turn:");

        int i;
        int j;

        String vertical;
        int horizontal;
        do {
            System.out.println("Please enter vertical coordinate: A, B or C.");
            vertical = input.nextLine();
            System.out.println("Please enter horizontal coordinate: 1, 2 or 3.");
            horizontal = input.nextInt();

            if ((horizontal > 4 || horizontal < 1) &&
                    !((vertical.equals("A") || (vertical.equals("B") || (vertical.equals("C")))))) {
                System.out.println("Wrong input. Try again...");

            }
        } while ((horizontal > 4 || horizontal < 1) &&
                !((vertical.equals("A") || (vertical.equals("B") || (vertical.equals("C"))))));

        if (vertical.equals("A")) {
            j = 0;
        } else if (vertical.equals("B")) {
            j = 1;
        } else if (vertical.equals("C")) {
            j = 2;
        } else {
            j = -1;
        }

        i = horizontal - 1;

        board[i][j] = playerSymbol;

        return board;
    }

    public static void computerTurn(String[][] board, String computerSymbol) {
        Random random = new Random();
        int i;
        int j;

        System.out.println("Computer's turn:");
        for (; ; ) {
            i = random.nextInt(3);
            j = random.nextInt(3);


            if (!board[i][j].equals("X") && !board[i][j].equals("O")) {
                board[i][j] = computerSymbol;
                System.out.println(i);
                System.out.println(j);
                break;
            }
        }
    }

    public static boolean win(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < 1; j++) {
                if ((board[i][j].equals(board[i][j + 1]) && board[i][j + 1].equals(board[i][j + 2])) &&
                        !board[i][j].equals("*") && !board[i][j + 1].equals("*") && !board[i][j + 2].equals("*")) {
                    return true;
                }
            }
        }

        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < 1; i++) {
                if ((board[i][j].equals(board[i + 1][j]) && board[i + 1][j].equals(board[i + 2][j])) &&
                        !board[i][j].equals("*") && !board[i + 1][j].equals("*") && !board[i + 2][j].equals("*")) {
                    return true;
                }
            }
        }

        if (((board[0][0]).equals(board[1][1]) && board[1][1].equals(board[2][2])) &&
                (!board[0][0].equals("*"))) {
            return true;
        }

        if (((board[0][2]).equals(board[1][1]) && board[1][1].equals(board[2][0])) &&
                !board[0][2].equals("*")) {
            return true;
        }
        return false;
    }

    public static void gameplay(String[][] board, String playerSymbol, String computerSymbol) {

        displayBoard(board);

        if (playerSymbol.equals("X")) {

            for (int k = 0; k < 5; k++) {

                playerTurn(board, playerSymbol);
                displayBoard(board);

                if (win(board)) {
                    System.out.println("!!! Player WINS !!!");
                    break;
                }

                if (!win(board) && k == 4) {
                    System.out.println("!!! DRAW !!!");
                    break;
                }
                computerTurn(board, computerSymbol);
                displayBoard(board);

                if (win(board)) {
                    System.out.println("!!! Computer WINS !!!");
                    break;
                }
            }

        } else {

            for (int k = 0; k < 5; k++) {

                computerTurn(board, computerSymbol);
                displayBoard(board);
                if (win(board)) {
                    System.out.println("!!! Computer WINS !!!");
                    break;
                }

                if (!win(board) && k == 4) {
                    System.out.println("!!! DRAW !!!");
                    break;
                }
                playerTurn(board, playerSymbol);
                displayBoard(board);
                if (win(board)) {
                    System.out.println("!!! Player WINS !!!");
                    break;

                }
            }
        }
    }

}

