package week2_1_circle;

public class Point {
    int x;
    int y;
    public Point(){

    }
    public Point(int xnew, int ynew){
        x = xnew;
        y = ynew;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    @Override
    public String toString(){
       return "x: " + x + ", y: " + y;
    }
}
