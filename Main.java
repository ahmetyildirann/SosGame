import model.Horizontal;
import model.LeftDiagonal;
import model.RightDiagonal;
import model.Vertical;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        play();
    }
    public static void play(){

        Board board = new Board();

        Random random = new Random();

        int size= board.gameBoardSizeChecker();

        String[][] gameBoard = new String[size][size];

        Player player = new Player();
        Computer computer = new Computer();
        int[] playerScore= new int[1];
        int[] computerScore= new int[1];

        SosChecker sosChecker = new SosChecker();

        board.initializeBoard(gameBoard);
        boolean isBoardFull=false;

        int startingOrderDeterminer=random.nextInt((1) + 1);

        if(startingOrderDeterminer==0)
            System.out.println("Player is starting the game");
        else
            System.out.println("Computer is starting the game");


        List<LeftDiagonal> leftDiagonalList = new ArrayList<>();
        List<RightDiagonal> rightDiagonalList = new ArrayList<>();
        List<Horizontal> horizontalList = new ArrayList<>();
        List<Vertical> verticalList = new ArrayList<>();

        Horizontal horizontal = new Horizontal(0,0,0,0,0,0);
        horizontalList.add(horizontal);

        Vertical vertical =new Vertical(0,0,0,0,0,0);
        verticalList.add(vertical);

        LeftDiagonal leftDiagonal = new LeftDiagonal(0,0,0,0,0,0);
        leftDiagonalList.add(leftDiagonal);

        RightDiagonal rightDiagonal = new RightDiagonal(0,0,0,0,0,0);
        rightDiagonalList.add(rightDiagonal);

        while (!isBoardFull){


            if(startingOrderDeterminer==0){

                player.playerMove(gameBoard);
                sosChecker.sosCheckerForPoint(gameBoard,horizontalList,verticalList,leftDiagonalList,rightDiagonalList,"Player",computerScore,playerScore);

                board.printBoard(gameBoard);
                board.displayScores(computerScore,playerScore);

                isBoardFull=board.isFinish(gameBoard);

                if(isBoardFull)
                    break;

                computer.playComputer(gameBoard);

                sosChecker.sosCheckerForPoint(gameBoard,horizontalList,verticalList,leftDiagonalList,rightDiagonalList,"Computer",computerScore,playerScore);

                board.printBoard(gameBoard);
                board.displayScores(computerScore,playerScore);

                isBoardFull =board.isFinish(gameBoard);

                if(isBoardFull)
                    break;

            }

            else{

                computer.playComputer(gameBoard);

                sosChecker.sosCheckerForPoint(gameBoard,horizontalList,verticalList,leftDiagonalList,rightDiagonalList,"Computer",computerScore,playerScore);

                board.printBoard(gameBoard);
                board.displayScores(computerScore,playerScore);

                isBoardFull =board.isFinish(gameBoard);

                if(isBoardFull)
                    break;

                player.playerMove(gameBoard);
                sosChecker.sosCheckerForPoint(gameBoard,horizontalList,verticalList,leftDiagonalList,rightDiagonalList,"Player",computerScore,playerScore);

                board.printBoard(gameBoard);
                board.displayScores(computerScore,playerScore);

                isBoardFull=board.isFinish(gameBoard);

                if(isBoardFull)
                    break;
            }
        }
        board.gameResult(playerScore,computerScore);

    }
}
