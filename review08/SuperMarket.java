package review08;

public class SuperMarket {

    public static void main(String[] args) {

        Apple apple = new Apple("Fuji", "red");
        apple.name = "Fuji apple";
        apple.makeJuice(); // its own method
        apple.eat(); // comes from parent
        // apple.grow(); // sibling class do not share anything

        apple.getClass(); // Methods comes from the object class => it is the parent class of all objects in Java




    }
}
