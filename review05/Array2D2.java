package review05;

public class Array2D2 {

    public static void main(String[] args) {

        int[][] numbers = new int[3][4];

        // 1 row
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;

        // 2 row
        numbers[1][0] = 10;
        numbers[1][1] = 20;
        numbers[1][2] = 30;
        numbers[1][3] = 40;

        // 3 row
        numbers[2][0] = 100;
        numbers[2][1] = 200;
        numbers[2][2] = 300;
        numbers[2][3] = 400;

        // How to find out how many rows we have?
        System.out.println(numbers.length); // 3 rows
        System.out.println(numbers[0].length); // 4 columns

        for (int row = 0; row < numbers.length; row++) { // outer loop iterates over the rows
            for (int columns = 0; columns < numbers[row].length; columns++) { // inner loop iterates over the columns

                System.out.print(numbers[row][columns]+" ");

            }

            System.out.println();
        }


    }
}
