package review08;

public class Fruit {

    public String name, color;

    Fruit(String name, String color) {
        this.name = name;
        this.color = color;

    }


    public void eat() {
        System.out.println("We can eat "+name);
    }
}

// 1 parent class -> 1 child class => single inheritance
class Mango extends Fruit {

    int price;

    Mango(String name, String color, int price) {
        super(name, color); // We must make a call to the parent class constructor
        this.price = price;
    }
    protected void grow(String country) {
        System.out.println(name+" grows in "+country);
    }
}

// 1 parent class -> 2 child class => hierarchical inheritance
class Apple extends Fruit {

    Apple(String name, String color) {
            super(name, color);
    }
    protected void makeJuice() {
        System.out.println("We can make "+name+" juice");

    }
}

// 1 parent class -> 1 child class -> 1 grandchild class => multilevel
class BabyApple extends Apple {

    BabyApple(String name, String color) {
        super(name, color);
    }
    void print() {
        System.out.println(name + " is very small");

    }
}