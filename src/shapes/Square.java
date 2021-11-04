package shapes;

public class Square extends Quadrilateral{
    protected Square(int side) {
        super(side,side);
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width ;
    }

    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setWidth(int side) {
        this.width = side;

    }

    @Override
    public void setLength(int side) {
        this.length = side;

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
