package tictactoe;

public class NumberCheck {

    int index1;
    int index2;
    String[] parts;

    boolean indexConvert;
    boolean rangeCheck;

    public NumberCheck() {

        this.index1 = 0;
        this.index2 = 0;
        indexConvert = true;
        rangeCheck = false;

    }

    public void SplitString(String input) {

        this.parts = input.split(" ");
    }

    public void indexConvert() {

        try {
            index1 = Integer.valueOf(parts[0]);
            index2 = Integer.valueOf(parts[1]);
        }
        catch(Exception e) {
            System.out.println("You should enter numbers!");
            indexConvert = false;
        }
    }

    public void rangeCheck() {
        if (index1 <= 0 || index2 <= 0 || index1 > 3 || index2 >3) {
            System.out.println("Coordinates should be from 1 to 3");
        }
        else {
            rangeCheck = true;
        }
    }

    public boolean isIndexConvert() {
        return indexConvert;
    }

    public boolean isRangeCheck() {

        return rangeCheck;
    }

    public int getIndex1() {
        return index1;
    }

    public int getIndex2() {
        return index2;
    }
}
