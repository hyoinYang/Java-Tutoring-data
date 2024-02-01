package week2_2_calcShape;

public class ARectangle extends AbstractShape{
    private double width;
    private double height;

    ARectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }
}
