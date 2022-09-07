package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        //System.out.print("> ");
        //String input = scanner.nextLine();
        //String input = ("_________");
        //printFilledGrid();
        System.out.println(!board.checkGameState());
        while (!board.checkGameState()) {
            board.printCustomGrid();
            board.askInput();

        }
        //checkGameState(input);

    }

    public static void printFilledGrid() {
        System.out.println("X O X");
        System.out.println("O X O");
        System.out.println("X O X");
    }
/*
    public static String askInput(Scanner scanner, String currentState) {
        //System.out.println(currentState);
        char[] oldState = currentState.toCharArray();
        //char[] newState = new char[8];
        StringBuilder newState = new StringBuilder();
        boolean areNumbers = false;


        //System.out.print("> ");
        String index = "";
        String[] parts;
        //index = scanner.nextLine();
        int index1 = 0;
        int index2 = 0;


        while ((!index.matches("\\w \\w")) || areNumbers == false || !checkOccupied(currentState,oldState,index1,index2) || checkLimit(index1, index2)) {
            //System.out.println("You should enter numbers!");
            System.out.print("> ");
            index = scanner.nextLine();

            parts = index.split(" ");
            //System.out.println(parts[0]);
            //System.out.println(parts[1]);

            try {
                index1 = Integer.parseInt(parts[0]);
                index2 = Integer.parseInt(parts[1]);
                areNumbers = true;
                //System.out.println(index2);

            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                areNumbers = false;

            }
            //System.out.println(checkOccupied(currentState,oldState,index1,index2));

            if (checkLimit(index1, index2)) {
                System.out.println("Coordinates should be from 1 to 3!");
            }

            if ( !checkOccupied(currentState,oldState,index1,index2)  ) {
                System.out.println("This cell is occupied! Choose another one!");
            }
        }
/*
        while (!((index1 == 1 || index1 == 2 || index1 == 3) &&
                (index2 == 1 || index2 == 2 || index2 == 3))) {

            System.out.println("Coordinates should be from 1 to 3!");
            System.out.print("> ");
            index = scanner.nextLine();
            parts = index.split(" ");

            index1 = Integer.parseInt(parts[0]);
            index2 = Integer.parseInt(parts[1]);
            //System.out.println("index1:2 " + index1);
            //System.out.println("index2:2 " + index2);
        }

        setUnoccupied(oldState,index1,index2);
        for (int i = 0; i < oldState.length; i++) {
            newState.append(oldState[i]);
        }
        //System.out.println(newState);

        printCustomGrid(newState.toString());
        return newState.toString();
    }

    public static void printCustomGrid(String input) {


        System.out.println("---------");
        //System.out.print("| ");

        for (int i = 0; i < input.length(); i++) {
            if (i % 3 == 0) {
                System.out.print("| ");
                System.out.print(input.charAt(i) + " ");
                continue;
            }
            if (i == 2 || i == 5 || i == 8) {
                System.out.print(input.charAt(i) + " ");
                System.out.print("|");
                System.out.println();
                continue;
            }

            System.out.print(input.charAt(i) + " ");
        }

        System.out.println("---------");
    }

    public static boolean checkLimit(int index1, int index2) {

        if (!((index1 == 1 || index1 == 2 || index1 == 3) &&
                (index2 == 1 || index2 == 2 || index2 == 3))) {

            //System.out.println("Coordinates should be from 1 to 3!");

        }
        else {
            return false;
        }
        return true;
    }

    public static boolean checkOccupied(String input,char[] oldState, int index1, int index2) {
        boolean sNull = index1 == 0 && index2 == 0;
        boolean s0 = index1 == 1 && index2 == 1 && oldState[0] == '_';
        boolean s1 = index1 == 1 && index2 == 2 && oldState[1] == '_';
        boolean s2 = index1 == 1 && index2 == 3 && oldState[2] == '_';
        boolean s3 = index1 == 2 && index2 == 1 && oldState[3] == '_';
        boolean s4 = index1 == 2 && index2 == 2 && oldState[4] == '_';
        boolean s5 = index1 == 2 && index2 == 3 && oldState[5] == '_';
        boolean s6 = index1 == 3 && index2 == 1 && oldState[6] == '_';
        boolean s7 = index1 == 3 && index2 == 2 && oldState[7] == '_';
        boolean s8 = index1 == 3 && index2 == 3 && oldState[8] == '_';
        boolean notOccupied = false;
        boolean s9 = !((index1 == 1 || index1 == 2 || index1 == 3) &&
                (index2 == 1 || index2 == 2 || index2 == 3));

        if (sNull) {
            notOccupied = false;
        }

        if(s0) {
            notOccupied = true;
        }
        if(s1) {
            notOccupied = true;
        }
        if(s2) {
            notOccupied = true;
        }
        if(s3) {
            notOccupied = true;
        }
        if(s4) {
            notOccupied = true;
        }
        if(s5) {
            notOccupied = true;
        }
        if(s6) {
            notOccupied = true;
        }
        if(s7) {
            notOccupied = true;
        }
        if(s8) {
            notOccupied = true;
        }
        if(s9) {
            notOccupied = true;
        }





        return notOccupied;
    }

    public static char[] setUnoccupied(char[] oldState, int index1, int index2) {

        boolean s0 = index1 == 1 && index2 == 1 && oldState[0] == '_';
        boolean s1 = index1 == 1 && index2 == 2 && oldState[1] == '_';
        boolean s2 = index1 == 1 && index2 == 3 && oldState[2] == '_';
        boolean s3 = index1 == 2 && index2 == 1 && oldState[3] == '_';
        boolean s4 = index1 == 2 && index2 == 2 && oldState[4] == '_';
        boolean s5 = index1 == 2 && index2 == 3 && oldState[5] == '_';
        boolean s6 = index1 == 3 && index2 == 1 && oldState[6] == '_';
        boolean s7 = index1 == 3 && index2 == 2 && oldState[7] == '_';
        boolean s8 = index1 == 3 && index2 == 3 && oldState[8] == '_';
        if (s0) {
            oldState[0] = 'X';

        }

        if (s1) {
            oldState[1] = 'X';

        }
        if (s2) {
            oldState[2] = 'X';

        }
        if (s3) {
            oldState[3] = 'X';

        }
        if (s4) {
            oldState[4] = 'X';

        }
        if (s5) {
            oldState[5] = 'X';

        }
        if (s6) {
            oldState[6] = 'X';

        }
        if (s7) {
            oldState[7] = 'X';

        }
        if (s8) {
            oldState[8] = 'X';

        }
        return oldState;
    }

    public static boolean checkGameState(String input) {
        int xTally = 0;
        int oTally = 0;
        int underTally = 0;
        boolean possible = true;
        boolean win = false;
        boolean endGame = false;


        boolean xWin = ((input.charAt(0) == 'X') && (input.charAt(4) == 'X') && (input.charAt(8) == 'X')) ||
                ((input.charAt(2) == 'X') && (input.charAt(4) == 'X') && (input.charAt(6) == 'X')) ||
                ((input.charAt(0) == 'X') && (input.charAt(3) == 'X') && (input.charAt(6) == 'X')) ||
                ((input.charAt(1) == 'X') && (input.charAt(4) == 'X') && (input.charAt(7) == 'X')) ||
                ((input.charAt(2) == 'X') && (input.charAt(5) == 'X') && (input.charAt(8) == 'X')) ||
                ((input.charAt(0) == 'X') && (input.charAt(1) == 'X') && (input.charAt(2) == 'X')) ||
                ((input.charAt(3) == 'X') && (input.charAt(4) == 'X') && (input.charAt(5) == 'X')) ||
                ((input.charAt(6) == 'X') && (input.charAt(7) == 'X') && (input.charAt(8) == 'X'));
        boolean oWin = input.charAt(0) == 'O' && input.charAt(4) == 'O' && input.charAt(8) == 'O' ||
                input.charAt(2) == 'O' && input.charAt(4) == 'O' && input.charAt(6) == 'O' ||
                input.charAt(0) == 'O' && input.charAt(3) == 'O' && input.charAt(6) == 'O' ||
                input.charAt(1) == 'O' && input.charAt(4) == 'O' && input.charAt(7) == 'O' ||
                input.charAt(2) == 'O' && input.charAt(5) == 'O' && input.charAt(8) == 'O' ||
                input.charAt(0) == 'O' && input.charAt(1) == 'O' && input.charAt(2) == 'O' ||
                input.charAt(3) == 'O' && input.charAt(4) == 'O' && input.charAt(5) == 'O' ||
                input.charAt(6) == 'O' && input.charAt(7) == 'O' && input.charAt(8) == 'O';

        char x = 'X';
        char o = 'O';

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == x) {
                xTally = xTally + 1;
            }
            if (input.charAt(i) == o) {
                oTally = oTally + 1;
            }
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '_') {
                underTally = underTally + 1;
            }
        }


        if (xTally - oTally >= 2 || oTally - xTally >= 2) {
            System.out.println("Impossible");
            possible = false;
        }

        if (xWin && oWin) {
            System.out.println("Impossible");
            possible = false;

        } else if (xWin) {
            System.out.println("X wins");
            win = true;
            endGame = true;
        } else if (oWin) {
            System.out.println("O wins");
            win = true;
            endGame = true;

        } else if (input.contains("_") && possible == true) {
            System.out.println("Game not finished");
            endGame = false;
        } else if (!win && possible) {
            System.out.println("Draw");
            endGame = true;
        }
        return endGame;

    }
    */
}
