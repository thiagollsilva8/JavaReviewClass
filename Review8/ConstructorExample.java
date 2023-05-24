package Review8;

public class ConstructorExample {

    /*
    How to create a constructor? rules
    1. must have the same name as a class
    2. no return type, not even void
     */
    // If we want to create our own constructor, we can create:
    // 1. non-argument
    // 2. parametrized constructor

    ConstructorExample() {
        System.out.println("I created this constructor");
    }

    ConstructorExample(String str) {
        System.out.println("I am parametrized constructor "+str);
    }

    public static void main(String[] args) {

        new ConstructorExample(); // calling a constructor of ConstructorExample class
                                  // When we do not create => the compiler creates a default constructor for us
                                  // Why => constructor is used to initialize the state of the object

        new ConstructorExample("Hello");
    }
}
