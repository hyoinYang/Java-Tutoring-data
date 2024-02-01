package week2_2_IShape;

public class RectangleImpl implements IShape {
    private double width;
    private double height;

    RectangleImpl(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
}
