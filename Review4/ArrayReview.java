package Review4;

public class ArrayReview {

    public static void main(String[] args) {

        int i = 10;

        int[] arr = new int[3];
        // We store elements based on indexes
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 12;

        // access also by indexes
        System.out.println(arr[1]);

        System.out.println();

        String[] planets = {"Earth", "Mars", "Jupiter", "Saturn", "Neptune"};

        for (int j = 0; j < planets.length; j++) {
            System.out.print(planets[j] + " ");
        }
    }
}
