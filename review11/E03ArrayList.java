package review11;

import java.util.ArrayList;

public class E03ArrayList {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Abraham");
        arrayList.add("Isaac");
        arrayList.add("Jacob");
        arrayList.add("David");
        arrayList.add("Solomon");
        arrayList.add("Jacob");

        for (String name : arrayList) {
            if (name.contains("a")) {
                System.out.println(name);
            }
        }
    }
}
