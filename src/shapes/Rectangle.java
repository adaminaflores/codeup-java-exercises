package shapes;


 public class Rectangle extends Quadrilateral implements Measurable {

     public Rectangle(int length, int width) {
         super(length, width);
     }

     public double getPerimeter() {
         return 0;
     }


     public double getArea() {
         return this.length * this.width;
     }

     @Override
     public void setWidth(int width) {
         this.width = width;

     }

     @Override
     public void setLength(int length) {
         this.length = length;

     }

     //    protected int length;
//    protected int width;

//    public Rectangle(){};

//    public Rectangle(int length){
//        this.length = length;
//
//    }
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        return length * width;
//
//    }
//    public int getPerimeter(){
//        return 2 * length + 2 * width;
//
//    }




}
