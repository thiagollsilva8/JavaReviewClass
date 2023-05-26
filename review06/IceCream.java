package review06;

public class IceCream {
    /*
    Classes are attributes
    Variables Syntax
    dataType name;
     */

    String flavor, color;

    boolean dairyFree;

    double price;

    /*
    Methods are behavior
    Methods Syntax
    returnType name() { };
     */

    void eat() {
        System.out.println("We can eat "+flavor+" Ice cream");
    }

    void buy() {
        System.out.println(flavor+" ice cream cost "+price);
    }

}
