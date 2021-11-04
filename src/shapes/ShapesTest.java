package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(9);
        Measurable myShape2 = new Rectangle(2,5);

        //Square:
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());

        //Rectangle:
        System.out.println("myShape2.getPerimeter() = " + myShape2.getPerimeter());
        System.out.println("myShape2.getArea() = " + myShape2.getArea());


    }

//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box1.getArea() = " + box1.getArea());
//
//
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());
//
//    }
}
