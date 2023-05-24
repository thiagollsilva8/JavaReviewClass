package Review5;

/*
Write a program to swap 2 numbers without a temporary variable
 */
public class Task5 {

    public static void main(String[] args) {

        int a =10;
        int b = 20;

        a = a+b; //30
        b = a-b; //10
        a = a-b; //20
        System.out.println(" After swap: ");
        System.out.println(" a = "+ a);
        System.out.println(" b = "+ b);



    }
}
