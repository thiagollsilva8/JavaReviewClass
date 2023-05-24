package Review9;

public class ShapeTest {

    public static void main(String[] args) {

        // Shape shape = new Shape(); => we cannot create an object of the abstract class

        Triangle triangle = new Triangle("Triangle", "purple", 12, 18);
        triangle.print();
        System.out.println("area = " + triangle.calculateArea());
        triangle.printInfo();

        Rectangle rectangle = new Rectangle("rectangle", "green", 10, 20);
        rectangle.printInfo();
        System.out.println("Area of the rectangle " + rectangle.calculateArea());

        Shape shape = new Triangle("Triangle", "red", 120, 180);
        shape.printInfo();
        System.out.println(shape.calculateArea());

        Shape[] bigShape = {new Triangle("Triangle", "pink", 120, 108),
                             new Rectangle("rectangle", "blue", 30, 25),
                                new Rectangle("rectangle", "brown", 100, 20)};

        for (Shape shape1 : bigShape) {
            shape1.printInfo();
            double area = shape1.calculateArea();
            System.out.println("The area of the "+shape1.color+" "+shape1.type+" = "+area);

        }



    }
}
