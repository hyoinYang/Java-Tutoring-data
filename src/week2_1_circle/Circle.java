package week2_1_circle;

public class Circle extends Point{
    private double radius;

    public Circle(int xnew, int ynew, int rnew){
        super(xnew, ynew);
        radius = rnew;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString(){
        return "x: " + x + ", y: " + y + ", radius: " + radius;
    }
}
