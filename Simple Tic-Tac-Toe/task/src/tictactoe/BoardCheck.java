package tictactoe;

public class BoardCheck {

    String[] gameState;
    int index1;
    int index2;

    boolean occupied;

    public BoardCheck(String[] gameState) {
        this.gameState = gameState;
        this.occupied = true;
    }

    public void checkOccupied(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;


        if (index1 == 1 && index2 == 1 && gameState[0] == "_") {
            occupied = false;
        }
        if (index1 == 1 && index2 == 2 && gameState[1] == "_") {
            occupied = false;
        }
        if(index1 == 1 && index2 == 3 && gameState[2] == "_") {
            occupied = false;
        }
        if(index1 == 2 && index2 == 1 && gameState[3] == "_") {
            occupied = false;
        }
        if(index1 == 2 && index2 == 2 && gameState[4] == "_") {
            occupied = false;
        }
        if(index1 == 2 && index2 == 3 && gameState[5] == "_") {
            occupied = false;
        }
        if(index1 == 3 && index2 == 1 && gameState[6] == "_") {
            occupied = false;
        }
        if(index1 == 3 && index2 == 2 && gameState[7] == "_") {
            occupied = false;
        }
        if(index1 == 3 && index2 == 3 && gameState[8] == "_") {
            occupied = false;
        }
        else if (occupied == true) {
            System.out.println("This cell is occupied! Choose another one!");
        }
    }
    public String[] setCell() {
        if (index1 == 1 && index2 == 1 ) {
            gameState[0] = "X";
        }
        if (index1 == 1 && index2 == 2 ) {
            gameState[1] = "X";
        }
        if (index1 == 1 && index2 == 3 ) {
            gameState[2] = "X";
        }
        if (index1 == 2 && index2 == 1 ) {
            gameState[3] = "X";
        }
        if (index1 == 2 && index2 == 2 ) {
            gameState[4] = "X";
        }
        if (index1 == 2 && index2 == 3 ) {
            gameState[5] = "X";
        }
        if (index1 == 3 && index2 == 1 ) {
            gameState[6] = "X";
        }
        if (index1 == 3 && index2 == 2 ) {
            gameState[7] = "X";
        }
        if (index1 == 3 && index2 == 3 ) {
            gameState[8] = "X";
        }
        return gameState;
    }

    public void checkWin() {
        boolean xWin = ((gameState[0].equals("X")) && (gameState[4].equals("X")) && (gameState[8].equals("X"))) ||
                ((gameState[2].equals("X")) && (gameState[4].equals("X")) && (gameState[6].equals("X"))) ||
                ((gameState[0].equals("X")) && (gameState[3].equals("X")) && (gameState[6].equals("X"))) ||
                ((gameState[1].equals("X")) && (gameState[4].equals("X")) && (gameState[7].equals("X"))) ||
                ((gameState[2].equals("X")) && (gameState[5].equals("X")) && (gameState[8].equals("X"))) ||
                ((gameState[0].equals("X")) && (gameState[1].equals("X")) && (gameState[2].equals("X"))) ||
                ((gameState[3].equals("X")) && (gameState[4].equals("X")) && (gameState[5].equals("X"))) ||
                ((gameState[6].equals("X")) && (gameState[7].equals("X")) && (gameState[8].equals("X")));

        boolean oWin = ((gameState[0].equals("O")) && (gameState[4].equals("O")) && (gameState[8].equals("O"))) ||
                ((gameState[2].equals("O")) && (gameState[4].equals("O")) && (gameState[6].equals("O"))) ||
                ((gameState[0].equals("O")) && (gameState[3].equals("O")) && (gameState[6].equals("O"))) ||
                ((gameState[1].equals("O")) && (gameState[4].equals("O")) && (gameState[7].equals("O"))) ||
                ((gameState[2].equals("O")) && (gameState[5].equals("O")) && (gameState[8].equals("O"))) ||
                ((gameState[0].equals("O")) && (gameState[1].equals("O")) && (gameState[2].equals("O"))) ||
                ((gameState[3].equals("O")) && (gameState[4].equals("O")) && (gameState[5].equals("O"))) ||
                ((gameState[6].equals("O")) && (gameState[7].equals("O")) && (gameState[8].equals("O")));
    }

    public boolean isOccupied() {
        return occupied;
    }
}


