import week2_1_circle.Circle;
import week2_1_circle.Point;
import week2_2.IShape;
import week2_2.RectangleImpl;


public class Main {
    public static void main (String[] args){
//        IShape r = new RectangleImpl(10., 20.);
//        System.out.println("width: " + ((RectangleImpl) r).getWidth() + ", height: " + ((RectangleImpl)r).getHeight());
//        System.out.printf("area: %.2f\n", r.getArea());
//        System.out.printf("perimeter: %.2f\n", r.getPerimeter());

        Parent p = new Child();
        p.printState();



    }
}