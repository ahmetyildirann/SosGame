import java.util.Random;

public class Computer {


    public void playComputer(String mat[][]){

        String value ="os";
        String[] part = value.split("");

        int count=1;

        Random random = new Random();

        int selectValueIndex = random.nextInt((1) + 1);

        while (count!=0){

            int randomRow = random.nextInt(((mat[0].length - 1)) + 1);
            int randomColumn = random.nextInt(((mat[1].length - 1)) + 1);

            if(!mat[randomRow][randomColumn].equals("-"))
                continue;

            mat[randomRow][randomColumn]=part[selectValueIndex];
            count--;
        }

        System.out.println("Computer played.");


    }


}
