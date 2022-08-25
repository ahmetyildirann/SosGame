import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {

    public  void initializeBoard(String[][] matrix){

        for(int i=0;i<matrix.length;i++){

            for (int j=0;j<matrix[0].length;j++){

                matrix[i][j]="-";
            }
        }
    }

    public  void printBoard(String mat[][])
    {

        System.out.print(" ");
        for (int row = 1; row < mat.length+1; row++) {
            System.out.print("  " + row );
        }
        System.out.println();
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                if (col < 1) {
                    System.out.print(row+1);
                    System.out.print("  " + mat[row][col]);
                } else {

                    System.out.print("  " + mat[row][col]);
                }
            }
            System.out.println();
        }

    }

    public void displayScores(int[] playerScore,int[] computerScore){


        for(int i:playerScore){
            System.out.println("Player score:"+i);
        }

        for(int i:computerScore){
            System.out.println("Computer score:"+i);
        }
    }

    public boolean isFinish(String board[][]){

        for(int i=0;i<board.length;i++){

            for (int j=0;j<board[0].length;j++){

                if(board[i][j].equals("-"))

                    return false;
            }
        }

        return true;
    }

    public int gameBoardSizeChecker(){

        Scanner scanner = new Scanner(System.in);
        boolean isTrue=false;

        int size=0;

        do {
            try {

            System.out.print("Enter size:");
            size =scanner.nextInt();

                isTrue = false;

                if(!(size>=5 && size<=10)){

                    System.out.println("Index must be between 5 and 10");
                    isTrue=true;
                }

            }

            catch (Exception e){
                System.out.println("Error type is : "+e);
                System.out.println("Please enter number");
                isTrue=true;
                scanner.nextLine();
            }

        }while (isTrue);


        return size;
    }

    public void gameResult(int[] computerScore,int[] playerScore){

        String winnerMessage="";

        if(computerScore[0]>playerScore[0])
            winnerMessage+=" has won the game";

        else if(computerScore[0]<playerScore[0])
            winnerMessage+="Player has won the game";
        else
            winnerMessage+="Game is drow";



        System.out.println("\n\nComputer total score:"+ Arrays.toString(computerScore));
        System.out.println("Player total score"+ Arrays.toString(playerScore));
        System.out.println(winnerMessage);


    }



}
