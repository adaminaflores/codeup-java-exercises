package shapes;

abstract class Shape implements Measurable {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(2,5);
        Measurable myShape1 = new Square(9);
    }


}
