package week2_2;

import week2_2.IShape;

public class RectangleImpl implements IShape {
    double width;
    double height;

    public RectangleImpl(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }

    @Override
    public double getArea(){
        return height * width;
    }
    @Override
    public double getPerimeter(){
        return (height+width)*2;
    }

}
