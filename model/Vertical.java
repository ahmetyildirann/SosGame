package model;

public class Vertical {

    public int topRow;
    public int topColumn;

    public int middleRow;
    public int middleColumn;

    public int downRow;
    public int downColumn;

    @Override
    public String toString() {
        return "Vertical{" +
                "topRow=" + topRow +
                ", topColumn=" + topColumn +
                ", middleRow=" + middleRow +
                ", middleColumn=" + middleColumn +
                ", downRow=" + downRow +
                ", downColumn=" + downColumn +
                '}';
    }

    public Vertical(int topRow, int topColumn, int middleRow, int middleColumn, int downRow, int downColumn) {
        this.topRow = topRow;
        this.topColumn = topColumn;
        this.middleRow = middleRow;
        this.middleColumn = middleColumn;
        this.downRow = downRow;
        this.downColumn = downColumn;
    }
}
