package tictactoe;

public class TurnCounter {
    int turnCounter;

    public TurnCounter () {
        turnCounter = 0;
    }

    public void addTurn() {
        turnCounter++;
    }
    public int getTurnCounter() {
        return turnCounter;
    }
}
