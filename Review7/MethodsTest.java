package Review7;

public class MethodsTest {

    public static void main(String[] args) {

        JavaMethods jm = new JavaMethods();
        jm.hello();
        jm.helloName("Leo");
        // jm.helloName('J'); -- the method was called for a String not a char

        double temp = jm.convert(36.6);
        System.out.println(temp);

        String[] word = jm.arr("Today is May 4th");
        for (String s : word) {
            System.out.println(s);
        }

        // System.out.println(str); CE: variable str is not visible because it is ...



    }

}