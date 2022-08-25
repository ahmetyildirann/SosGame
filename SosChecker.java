
import model.Horizontal;
import model.LeftDiagonal;
import model.RightDiagonal;
import model.Vertical;

import java.util.List;

public class SosChecker {

    public void horizontalChecker(String[][] board, List<Horizontal> horizontalList, String mover, int[] playerScore, int[] computerScore) {


        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if ("o".equals(board[i][j])) {

                    if (j > 0 && j < board[0].length - 1) {

                        if (("s".equals(board[i][j - 1]) && "s".equals(board[i][j + 1]))) {

                            for (int k = 0; k < horizontalList.size(); k++) {

                                if (this.isIncludeHorizontal(board,horizontalList,i,j-1,i,j,i,j+1)) {

                                    Horizontal horizontal = new Horizontal(i, j - 1, i, j, i, j + 1);
                                    horizontalList.add(horizontal);
                                    System.out.println("Horizontal Point!");

                                    if (mover.equals("Player"))
                                        playerScore[0]++;
                                    if (mover.equals("Computer"))
                                        computerScore[0]++; }
                            } } } } } }
    }

    public boolean isIncludeHorizontal(String[][] board, List<Horizontal> horizontalList,int leftRow,int leftColumn,int middleRow,int middleColumn,int rightRow,int rightColumn) {

        for (Horizontal list : horizontalList)

            if (    list.leftRow == leftRow &&
                    list.leftColumn == leftColumn &&
                    list.middleRow == middleRow &&
                    list.middleColumn == middleColumn &&
                    list.rightRow == rightRow &&
                    list.rightColumn == rightColumn) {

                return false;
            }

        return true;
    }

    public void diagonalChecker(String[][] board, List<LeftDiagonal> leftDiagonalList, List<RightDiagonal> rightDiagonalList, String mover, int[] playerScore, int[] computorScore) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if(i!=0 && i!= board.length-1){

                    if(j!=0 && j!=board.length-1) {

                        if ("o".equals(board[i][j])) {

                            if (("s".equals(board[i - 1][j - 1]) && "s".equals(board[i + 1][j + 1]))) {

                                for (int k = 0; k < leftDiagonalList.size(); k++) {


                                    if (isIncludeLeftDiagonal(board,leftDiagonalList,i-1,j-1,i,j,i+1,j+1)) {

                                        LeftDiagonal leftDiagonal = new LeftDiagonal(i - 1, j - 1, i, j, i + 1, j + 1);
                                        leftDiagonalList.add(leftDiagonal);
                                        System.out.println("Left Diagonal Point!");

                                        if (mover.equals("Player"))
                                            playerScore[0]++;
                                        if (mover.equals("Computer"))
                                            computorScore[0]++;
                                    }
                                }
                            }
                            if(("s".equals(board[i + 1][j - 1]) && "s".equals(board[i - 1][j + 1]))){

                                for (int k = 0; k < rightDiagonalList.size(); k++) {


                                    if (isIncludeRightDiagonal(board,rightDiagonalList,i+1,j-1,i,j,i-1,j+1)) {

                                        RightDiagonal rightDiagonal = new RightDiagonal(i+1, j - 1, i, j, i -1, j + 1);
                                        rightDiagonalList.add(rightDiagonal);
                                        System.out.println("Right Diagonal Point!");

                                        if (mover.equals("Player"))
                                            playerScore[0]++;
                                        if (mover.equals("Computer"))
                                            computorScore[0]++;

                                    } } } } } } } }
    }


    public void verticalChecker(String[][] board, List<Vertical> verticalList, String mover, int[] playerScore, int[] computorScore) {


        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if ("o".equals(board[i][j])) {

                    if (i != 0 && i != board.length - 1) {

                        if (("s".equals(board[i - 1][j]) && "s".equals(board[i + 1][j]))) {

                            for (int k = 0; k < verticalList.size(); k++) {

                                if (this.isIncludeVertical(board,verticalList,i-1,j,i,j,i+1,j)) {

                                    Vertical vertical = new Vertical(i - 1, j, i, j, i + 1, j);
                                    verticalList.add(vertical);
                                    System.out.println("Vertical Point!");

                                    if (mover.equals("Player"))
                                        playerScore[0]++;
                                    if (mover.equals("Computor"))
                                        computorScore[0]++;
                                }
                            } } } } } } }

    public boolean isIncludeVertical(String[][] board, List<Vertical> verticalList,int topRow,int topColumn,int middleRow,int middleColumn,int downRow,int downColumn) {

        for (Vertical list : verticalList)

            if (    list.topRow == topRow &&
                    list.topColumn == topColumn &&
                    list.middleRow == middleRow &&
                    list.middleColumn == middleColumn &&
                    list.downRow == downRow &&
                    list.downColumn == downColumn) {

                return false;
            }

        return true;
    }

    public boolean isIncludeLeftDiagonal(String[][] board, List<LeftDiagonal> leftDiagonals,int leftTopRow,int leftTopColumn,int middleRow,int middleColumn,int rightDownRow,int rightDownColumn) {

        for (LeftDiagonal list : leftDiagonals)

            if (    list.leftTopRow == leftTopRow &&
                    list.leftTopColumn == leftTopColumn &&
                    list.middleRow == middleRow &&
                    list.middleColumn == middleColumn &&
                    list.rightDownRow == rightDownRow &&
                    list.rightDownColumn == rightDownColumn) {

                return false;
            }

        return true;
    }

    public boolean isIncludeRightDiagonal(String[][] board, List<RightDiagonal> rightDiagonals, int topRightRow, int topRightColumn, int middleRow, int middleColumn, int downLeftRow, int downLeftColumn) {

        for (RightDiagonal list : rightDiagonals)

            if (    list.topRightRow == topRightRow &&
                    list.topRightColumn == topRightColumn &&
                    list.middleRow == middleRow &&
                    list.middleColumn == middleColumn &&
                    list.downLeftRow == downLeftRow &&
                    list.downLeftColumn == downLeftColumn) {
                return false;
            }

        return true;
    }

    public void sosCheckerForPoint(String[][] gameBoard,List<Horizontal> horizontalList,List<Vertical> verticalList,List<LeftDiagonal> leftDiagonalList,List<RightDiagonal> rightDiagonalList,String mover,int[] playerScore, int[] computorScore){

        this.diagonalChecker(gameBoard,leftDiagonalList,rightDiagonalList,mover,playerScore,computorScore);
        this.horizontalChecker(gameBoard,horizontalList,mover,playerScore,computorScore);
        this.verticalChecker(gameBoard,verticalList,mover,playerScore,computorScore);

    }



}
