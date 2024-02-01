package week2_2_turtle;

public class SeaTurtle extends Turtle{
    public void swim(){
        System.out.println("A sea turtle swim");
    }

    @Override
    public void eat(){
        System.out.println("SeaTurtle eats "+ food);
    }
}
