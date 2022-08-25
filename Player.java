



import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {


    public void playerMove(String gameBoard[][]){

        Scanner scanner = new Scanner(System.in);
        boolean isUnique=true;


        while (isUnique){


            boolean isTrue=false;

            do {
                try {
                    System.out.print("Please enter your row which you want to add:");
                    int row = scanner.nextInt();
                    System.out.print("Please enter your column which you want to add:");
                    int column = scanner.nextInt();




                    if (row >= gameBoard.length+1 || column >= gameBoard.length+1) {

                        System.out.println("Out of index.Please check your indexes.");
                        continue;
                    }
                    if (row==0 ||column==0){
                        System.out.println("Row and column number must be bigger than 0");
                        continue;
                    }
                    if (!gameBoard[row - 1][column - 1].equals("-")) {
                        System.out.println("This spot is occupied. Please try again");
                        continue;
                    }

                    boolean isLetter = true;

                    while (isLetter){
                        System.out.print("Please enter letter : ");
                        String letter;
                        letter = scanner.next();

                        if (!(letter.equals("s") || letter.equals("o"))){
                            System.out.println("Please enter s or o ");
                            continue;
                        }
                        isLetter = false;

                        gameBoard[row-1][column-1] = letter;
                        System.out.println("player played");
                    }
                    isTrue = false;

                }catch (Exception e){
                    System.out.println("Error type  is : "+e);
                    System.out.println("Please enter row and cloumn again ");
                    isTrue=true;
                    scanner.nextLine();
                }
            }while (isTrue);

            isUnique=false;

        }

    }


}
