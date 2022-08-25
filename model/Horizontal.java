package model;


public class Horizontal {

    public int leftRow;
    public int leftColumn;

    public int middleRow;
    public int middleColumn;

    public int rightRow;
    public int rightColumn;


    @Override
    public String toString() {
        return "Horizontal{" +
                "leftRow=" + leftRow +
                ", leftColumn=" + leftColumn +
                ", middleRow=" + middleRow +
                ", middleColumn=" + middleColumn +
                ", rightRow=" + rightRow +
                ", rightColumn=" + rightColumn +
                '}';
    }

    public Horizontal(int leftRow, int leftColumn, int middleRow, int middleColumn, int rightRow, int rightColumn) {
        this.leftRow = leftRow;
        this.leftColumn = leftColumn;
        this.middleRow = middleRow;
        this.middleColumn = middleColumn;
        this.rightRow = rightRow;
        this.rightColumn = rightColumn;
    }
}
