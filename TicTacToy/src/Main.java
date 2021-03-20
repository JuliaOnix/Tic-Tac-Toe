import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        String[][] array = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        Scanner scanner = new Scanner(System.in);
        String  prompt  = "";
        String  greeting = "Hello! The first turn by [X].";
        boolean isFinish = true;
        int counterX = 0;

        while (isFinish) {
            System.out.println(greeting);

            //select cell and show current table

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == 0) {
                        System.out.print(" | ");
                    }

                    System.out.print(array[i][j] + " | ");
                }
                System.out.println("");
            }

            System.out.println("[x]'s turn, select cell");

            prompt = scanner.nextLine();

            //got a number and look for position
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j].equals(prompt)) {
                        array[i][j] = "X";
                    }
                }
            }

            System.out.println("[o]'s turn");

            //show current table
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == 0) {
                        System.out.print(" | ");
                    }

                    System.out.print(array[i][j] + " | ");
                }
                System.out.println("");
            }

            prompt = scanner.nextLine();

            //got a number and look for position
            for (int i = 0; i < array.length; i++)
            {
                for (int j = 0; j < array[i].length; j++)
                {
                    if (array[i][j].equals(prompt))
                    {
                        array[i][j] = "O";
                    }
                }
            }



            //Is winner?
            for (int i = 0; i < array.length; i++)
            {
                for (int j = 0; j < array[i].length; j++)
                {
                    /*X | X | X
                    * 4 | 5 | 6
                    * 7 | 8 | 9*/

                    if (array[0][j].equals("X"))
                    {
                        counterX++;

                        if ( counterX == 3)
                        {
                            System.out.println("You have won!");
                        }
                    }
                }
            }
        }
    }
}
