package week2_2_calcShape;

public class Main {
    public static void main(String[] args){
        AbstractShape[] abstractShape = new AbstractShape[2];
        abstractShape[0] = new ACircle(2);
        abstractShape[1] = new ARectangle(2, 3);

        for (int i = 0; i < abstractShape.length; i++){
            System.out.println(abstractShape[i].getArea());
        }
    }
}
