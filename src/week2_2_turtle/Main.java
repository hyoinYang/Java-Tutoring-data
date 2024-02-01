package week2_2_turtle;

public class Main {
    public static void main(String[] args){
        Turtle[] turtle = new Turtle[3];
        turtle[0] = new Turtle();
        turtle[1] = new SeaTurtle();
        turtle[2] = new LandTurtle();

        for (int i = 0; i < 3; i++){
            if (turtle[i] instanceof SeaTurtle){
                turtle[i].setFood("해조류");
                ((SeaTurtle)turtle[i]).swim();
            }
            else if (turtle[i] instanceof LandTurtle){
                turtle[i].setFood("풀, 선인장");
                ((LandTurtle)turtle[i]).walk();
            }
            else{
                turtle[i].setFood("미정");
            }
            turtle[i].eat();
        }
    }
}
