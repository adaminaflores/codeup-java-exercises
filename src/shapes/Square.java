package shapes;

public class Square extends Rectangle{
        private int side;

        public Square(int side){
                super(side);
                this.side = side;

        }
        public int getArea(){
                return side * side;
        }
        public int getPerimeter(){
                return 2 * side + 2 * side;
        }

}
