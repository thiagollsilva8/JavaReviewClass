package review11;

import java.util.ArrayList;

public class E4ArrayList {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Abraham");
        arrayList.add("Isaac");
        arrayList.add("Jacob");
        arrayList.add("David");
        arrayList.add("Solomon");
        arrayList.add("Jacob");

        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("David"));
        System.out.println(arrayList.indexOf("Isaac"));
        arrayList.remove("Jacob");
        System.out.println(arrayList);
        arrayList.removeIf(x -> x.startsWith("A"));
        System.out.println(arrayList);


    }
}