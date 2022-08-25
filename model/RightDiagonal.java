package model;

public class RightDiagonal {

    public int topRightRow;
    public int topRightColumn;

    public int middleRow;
    public int middleColumn;

    public int downLeftRow;
    public int downLeftColumn;

    public RightDiagonal(int topRightRow, int topRightColumn, int middleRow, int middleColumn, int downLeftRow, int downLeftColumn) {
        this.topRightRow = topRightRow;
        this.topRightColumn = topRightColumn;
        this.middleRow = middleRow;
        this.middleColumn = middleColumn;
        this.downLeftRow = downLeftRow;
        this.downLeftColumn = downLeftColumn;
    }
}