package week2_2_rectagle;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int h, int w){
        height = h; width = w;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public int getArea(){
        return height * width;
    }

}
