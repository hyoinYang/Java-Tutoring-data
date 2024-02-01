package week2_2_turtle;

public class LandTurtle extends Turtle{
    public void walk(){
        System.out.println("A land turtle walks");
    }

    @Override
    public void eat(){
        System.out.println("SeaTurtle eats "+ food);
    }
}
