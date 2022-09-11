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
        else {
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
        if (index1 == 3 && index2 == 2 ) {
            gameState[8] = "X";
        }
        return gameState;
    }

    public boolean isOccupied() {
        return occupied;
    }
}


