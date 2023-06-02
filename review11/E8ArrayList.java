package review11;

import java.util.ArrayList;

public class E8ArrayList {

    public static void main(String[] args) {

        ArrayList<String> student = new ArrayList<>();
        student.add("Abraham");
        student.add("Isaac");
        student.add("Jacob");
        student.add("David");
        student.add("Solomon");
        student.add("Jacob");
        student.add("Ester");

        System.out.println(student.get(3));
    }
}
