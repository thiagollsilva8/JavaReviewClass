package review06;

public class MoreStringsMethods {

    public static void main(String[] args) {

        String day = "Thursday";


        char character = day.charAt(2);
        System.out.println(character);  // u

        System.out.println("=========");

        int index = day.indexOf('s');
        System.out.println(index);  // 4

        System.out.println("==== SPLIT ====");

        String food = "I hate indian food";
        String [] words = food.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

    }
}
