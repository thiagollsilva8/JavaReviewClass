package review11;

import java.util.ArrayList;

public class E5ArrayList {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Abraham");
        arrayList.add("Isaac");
        arrayList.add("Jacob");
        arrayList.add("David");
        arrayList.add("Solomon");
        arrayList.add("Jacob");
        arrayList.add("Noah");

        // arrayList.removeIf(x -> x.startsWith("A"));

        // System.out.println(arrayList);

        // remove all the names which contain more than 5 letters
        // arrayList.removeIf(x -> x.length()>5);

        // remove all the names which contain odd number of letters
        // arrayList.removeIf(x -> x.length() % 2 != 0);

        // remove all the names that contain the letter 'a' or length of the name is more than 5
        arrayList.removeIf(x -> x.contains("e") || x.length() > 5);

        System.out.println(arrayList);
    }
}
