package tictactoe;

public class BoardCheck {

    String[] gameState;

    String xOrOTurn = "X";
    int index1;
    int index2;

    int xTally;
    int oTally;
    int spaceTally;

    boolean occupied;
    boolean possible;
    boolean gameOver;
    boolean Set;



    public BoardCheck() {
        //this.gameState = gameState;
        this.occupied = true;
        this.gameOver = false;
        this.Set = true;

        this.xTally = 0;
        this.oTally = 0;

    }

    public void setGameState(String[] gameState) {
        this.gameState = gameState;
    }

    public void checkOccupied(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;


        if (index1 == 1 && index2 == 1 && gameState[0].equals("_")) {
            occupied = false;
        }
        if (index1 == 1 && index2 == 2 &&gameState[1].equals("_")) {
            occupied = false;
        }
        if(index1 == 1 && index2 == 3 && gameState[2].equals("_")) {
            occupied = false;
        }
        if(index1 == 2 && index2 == 1 && gameState[3].equals("_")) {
            occupied = false;
        }
        if(index1 == 2 && index2 == 2 && gameState[4].equals("_")) {
            occupied = false;
        }
        if(index1 == 2 && index2 == 3 && gameState[5].equals("_")) {
            occupied = false;
        }
        if(index1 == 3 && index2 == 1 && gameState[6].equals("_")) {
            occupied = false;
        }
        if(index1 == 3 && index2 == 2 && gameState[7].equals("_")) {
            occupied = false;
        }
        if(index1 == 3 && index2 == 3 && gameState[8].equals("_")) {
            occupied = false;
        }
        else if (occupied) {
            System.out.println("This cell is occupied! Choose another one!");
        }
    }
    public String[] setCell() {
        if (index1 == 1 && index2 == 1 ) {
            gameState[0] = xOrOTurn;
        }
        if (index1 == 1 && index2 == 2 ) {
            gameState[1] = xOrOTurn;;
        }
        if (index1 == 1 && index2 == 3 ) {
            gameState[2] = xOrOTurn;;
        }
        if (index1 == 2 && index2 == 1 ) {
            gameState[3] = xOrOTurn;;
        }
        if (index1 == 2 && index2 == 2 ) {
            gameState[4] = xOrOTurn;;
        }
        if (index1 == 2 && index2 == 3 ) {
            gameState[5] = xOrOTurn;;
        }
        if (index1 == 3 && index2 == 1 ) {
            gameState[6] = xOrOTurn;;
        }
        if (index1 == 3 && index2 == 2 ) {
            gameState[7] = xOrOTurn;;
        }
        if (index1 == 3 && index2 == 3 ) {
            gameState[8] = xOrOTurn;;
        }
        //for(int i = 0; i< gameState.length; i++) {
          //  System.out.print(gameState[i]);
        //}
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

        if (xWin) {
            System.out.println("X wins");
            gameOver = true;
        }

        if (oWin) {
            System.out.println("O wins");
            gameOver = true;
        }
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void checkTally() {
        xTally = 0;
        oTally = 0;
        for (String cell : gameState) {
            if(cell.equals("X")) {
                xTally++;
            }
            if(cell.equals("O")) {
                oTally++;
            }
            else {
                spaceTally++;

            }
        }
    }
/*
    public void checkImpossible() {
        if (xTally - oTally >= 2 || oTally - xTally >= 2) {
            System.out.println("Impossible");
            possible = false;
        }

        if (xWin && oWin) {
            System.out.println("Impossible");
            possible = false;
        }
    }

 */

    public void setXOrOTurn() {
        System.out.println("IN METHOD: " + xOrOTurn);
        if (xOrOTurn.equals("X")) {
            xOrOTurn = "O" ;
            System.out.println("IN METHOD1: " + xOrOTurn);
            Set = false;
           //System.out.println("DEBUG1");
           //System.out.println(xOrOTurn);
        }

        System.out.println(xOrOTurn.equals("O") && Set!=false);
        if(xOrOTurn.equals("O") && Set!=false) {
            System.out.println("IN METHOD2: " + xOrOTurn);
            xOrOTurn = "X";
            Set = true;
            //System.out.println("DEBUG2");
            //System.out.println(xOrOTurn);
        }
    }

    public void checkDraw() {

    }

    public String getxOrOTurn() {
        return xOrOTurn;
    }
}


