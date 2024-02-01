package week2_2_calcShape;

public class ACircle extends AbstractShape{
    private double radius;

    ACircle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
