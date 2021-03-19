public class Main
{
    public static void main(String[] args) {

        String[][] array = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

        //show current table
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println("");
        }

    }
}
