package review11;

import java.util.ArrayList;

public class E02ArrayList {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Abraham");
        arrayList.add("Isaac");
        arrayList.add("Jacob");
        arrayList.add("David");
        arrayList.add("Solomon");
        arrayList.add("Jacob");

        System.out.println(arrayList);


        for (int i = 0; i < arrayList.size(); i++) {
            String name = arrayList.get(i);
            if (name.contains("a"))
            System.out.println(arrayList.get(i));
        }



    }
}
