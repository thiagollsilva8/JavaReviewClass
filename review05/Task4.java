package review05;

/*
Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for
that array.
 */
public class Task4 {

    public static void main(String[] args) {

        int[][] array = {
                {12, -12, 67, 56},
                {45, 2, 4},
                {56, 2},
                {67, 43, 11, 13}
        };
        int sumOdd = 0;
        int sumEven = 0;
        int number;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                number = array[i][j];

                if (array[i][j] % 2 == 0) {
                    sumEven += number;
                } else {
                    sumOdd += number;
                }
            }
        }

        System.out.println("Sum of even = " + sumEven);
        System.out.println("Sum of odd = " + sumOdd);
    }
}
