package model;


public class LeftDiagonal {

    public int leftTopRow;
    public int leftTopColumn;

    public int middleRow;
    public int middleColumn;

    public int rightDownRow;
    public int rightDownColumn;

    public LeftDiagonal(int leftTopRow, int leftTopColumn, int middleRow, int middleColumn, int rightDownRow, int rightDownColumn) {
        this.leftTopRow = leftTopRow;
        this.leftTopColumn = leftTopColumn;
        this.middleRow = middleRow;
        this.middleColumn = middleColumn;
        this.rightDownRow = rightDownRow;
        this.rightDownColumn = rightDownColumn;
    }
}
