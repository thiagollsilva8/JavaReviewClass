package review11;

import java.util.ArrayList;

public class E06ArrayList {

    public static void main(String[] args) {

        ArrayList<String> student = new ArrayList<>();
        student.add("Abraham");
        student.add("Isaac");
        student.add("Jacob");
        student.add("David");
        student.add("Solomon");
        student.add("Jacob");
        student.add("Ester");

        ArrayList<String> feeDefaulter = new ArrayList<>();
        feeDefaulter.add("Jacob");
        feeDefaulter.add("Solomon");
        feeDefaulter.add("Isaac");
        feeDefaulter.add("David");

        student.removeAll(feeDefaulter);
        System.out.println(student);


    }
}
