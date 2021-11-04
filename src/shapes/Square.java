package shapes;

public class Square extends Quadrilateral{
    protected Square(double side) {
        super(side,side);
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width ;
    }

    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double side) {
        this.length = side;

    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    //        private int side;
//
//        public Square(int side){
//                super(side);
//                this.side = side;
//
//        }
//        public int getArea(){
//                return side * side;
//        }
//        public int getPerimeter(){
//                return 2 * side + 2 * side;
//        }

}
