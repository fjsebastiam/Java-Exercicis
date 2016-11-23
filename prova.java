/**
 * Created by javix on 11/10/16.
 */
public class prova {
    public static void main(String[] args) {
        // Create Turtle object, los valores son la resolución
        Turtle t = new Turtle(500, 500);
        // Movements
        t.goTo(-200, -100);
        t.turnRight(90);
        t.forward(100);
        t.turnRight(90);
        t.forward(100);
        t.turnRight(9);
        t.forward(1);
        t.turnRight(9);
        t.forward(1);
        t.turnRight(9);
        t.forward(1);
        t.turnRight(9);
        t.forward(1);
        t.turnRight(9);
        t.forward(1);
        t.turnRight(9);
        t.forward(1);
        t.turnRight(9);
        t.forward(1);
        t.turnRight(9);
        t.forward(1);
        t.turnRight(9);
        t.forward(1);
        t.turnRight(9);
        t.forward(1);
        t.forward(50);

        // Show canvas
        t.show();

        //Dibuja una A
        t.goTo(-50, -100);
        t.turnRight(180);
        t.forward(50);
        t.turnRight(90);
        t.forward(50);
        t.turnRight(90);
        t.forward(50);
        t.turnRight(90);
        t.forward(50);
        t.forward(-100);
        t.forward(50);
        t.turnRight(90);
        t.forward(50);
        t.turnRight(90);
        t.forward(50);
        t.turnRight(90);
        t.turnRight(90);
        t.turnRight(90);
        t.turnRight(90);
        t.turnRight(90);

        // Show canvas
        t.show();

        t.goTo(50, -100);
        t.turnRight(-120);
        t.forward(110);
        t.turnRight(-120);
        t.forward(110);
        t.turnRight(150);

        // Show canvas
        t.show();

        t.goTo(200, -100);
        t.forward(100);

        // Show canvas
        t.show();
    }
}
