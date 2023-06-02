package review11;

import java.util.ArrayList;
import java.util.List;

public class E07ArrayList {

    public static void main(String[] args) {

        List<String> student = new ArrayList<>();
        student.add("Abraham");
        student.add("Isaac");
        student.add("Jacob");
        student.add("David");
        student.add("Solomon");
        student.add("Jacob");
        student.add("Ester");

        student.remove("Jacob");
        student.add(3, "James");
        System.out.println(student);


    }
}
