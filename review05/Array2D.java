package review05;

public class Array2D {

    public static void main(String[] args) {

        String[][] cars = {

                {"Ford", "Lincoln", "Dodge"},
                {"BMW", "Audi", "Mercedes", "VW", "Fiat"},
                {"Honda", "Toyota", "Subaru", "Nissan"}
        };
        System.out.println(cars[1][1]);

        for (String[] car : cars) { //outer loop iterates over each 1D array
            for (String s : car) { // nested loop iterates over each element of that 1D array
                System.out.print(s+" ");
            }

        }
    }
}
