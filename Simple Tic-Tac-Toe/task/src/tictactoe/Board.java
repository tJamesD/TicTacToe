package tictactoe;

public class Board {

    static String[][] boardArray;
    String currentTurn;

    public Board() {
        boardArray = new String[3][3];
        currentTurn = "X";
    }

    public static void printBoard() {
        System.out.println("---------");

        for (int row = 0; row < boardArray.length; row++) {
            for (int col = 0; col < boardArray[row].length; col++) {
                if ((row == 0 && col == 0) || (row == 1 && col == 0) || (row == 2 && col == 0)) {
                    System.out.print("| ");
                }
                if ((row == 0 && col == 2) || (row == 1 && col == 2) || (row == 2 && col == 2)) {
                    System.out.print(boardArray[row][col]);
                    System.out.print(" |");
                    System.out.println();
                    break;
                }
                System.out.print(boardArray[row][col] + " ");
            }
        }

        System.out.println("---------");
    }

    public static void createBoard() {
        for (int row = 0; row < boardArray.length; row++) {
            for (int col = 0; col < boardArray[row].length; col++) {
                boardArray[row][col] = "_";
            }
        }
    }

    public void setGrid(int index1, int index2) {
        boardArray[index1][index2] = currentTurn;
        setCurrentTurn();
    }

    public void setCurrentTurn() {
        boolean notChanged = true;
        if (currentTurn.equals("X")) {
            currentTurn = "O";
            notChanged = false;
        }
        if (currentTurn.equals("O") && notChanged) {
            currentTurn = "X";
        }
    }

    public String[] getCurrentGrid() {
        String[] currentGrid = new String[9];
        int i = 0;
        for (int rows = 0; rows < boardArray.length ; rows++) {
            for (int cols = 0; cols < boardArray[rows].length; cols++) {
                currentGrid[i] = boardArray[rows][cols];
                i++;
            }

        }
        return currentGrid;
    }

}
