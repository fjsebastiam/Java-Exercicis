/**
 * Created by javix on 13/10/16.
 */
public class ejercici1 {
    public static void main(String[] args) {
        int Y=-200;
        int X=100;
        Turtle t = new Turtle(500, 500);
        t.goTo(Y, X);
        int count2 = 0;
        while (count2 <5){
            t.turnLeft(90);
            t.turnLeft(90);
            t.forward(50);
            t.turnLeft(90);
            t.forward(50);
            t.turnLeft(90);
            t.forward(50);
            t.turnLeft(90);
            t.forward(50);
            t.turnLeft(90);
            t.forward(50);
            t.turnLeft(90);
            t.resetAngle();
            count2++;
        }
        t.show();
    }
}
