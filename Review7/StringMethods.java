package Review7;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Hello";
        String str1 = "Hello";

        String str2 = new String("Hello");

        System.out.println(str == str1);
        System.out.println(str1 == str2);

        str.toUpperCase(); // brand new string is created is reassigned to variable str
        System.out.println(str);

        StringBuilder sb = new StringBuilder("Hello"); // String builder is mutable
        sb.reverse();
        System.out.println(sb);

        sb.append("Hello"); // we have a String Builder object
        str = sb.toString(); // we convert String Builder object to string object and reassign to variable
        System.out.println(str);

        // Write a code to reverse a String

        String given = "Class";

        StringBuilder strb = new StringBuilder(given);
        given = strb.reverse().toString();

        System.out.println(given);

        // Reverse a String without using any inbuilt functions




    }
}
