/**
 * Created by javix on 8/11/16.
 */
public class m_1 {
    public static void main(String[] args) {
        int y=0;
        int x=0;
        Turtle t = new Turtle(1000, 1000);
        t.goTo(y, x);

        for (int i=0;i<5;i++){
            cuadradoHorizontal(t);
            espacioEnBlancoHorizontal(t);
        }
        x=x + -50;
        t.goTo(y, x);
        espacioEnBlancoVertical(t);

        for (int i=0;i<5;i++){
            cuadradoHorizontal(t);
            espacioEnBlancoHorizontal(t);
        }
        x=x + -100;
        t.goTo(y, x);
        espacioEnBlancoVertical(t);

        for (int i=0;i<5;i++){
            cuadradoHorizontal(t);
            espacioEnBlancoHorizontal(t);
        }
        t.show();
    }
    //Funcion que dibuja un cuadrado y resetea el angulo
    static void cuadradoHorizontal(Turtle t) {
        t.turnRight(90);
        t.forward(50);
        t.turnRight(90);
        t.forward(50);
        t.turnRight(90);
        t.forward(50);
        t.turnRight(90);
        t.forward(50);
        t.turnRight(90);
        t.forward(50);
        t.resetAngle();
    }
    //Funcion que dibuja un espacio en blanco horizontal y resetea el angulo.
    static void espacioEnBlancoHorizontal(Turtle t) {
        t.penDown = false;
        t.turnRight(90);
        t.forward(50);
        t.resetAngle();
        t.penDown = true;
    }
    //Funcion que dibuja un espacio en blanco horizontal y resetea el angulo.
    static void espacioEnBlancoVertical(Turtle t) {
        t.penDown = false;
        t.turnRight(90);
        t.turnRight(90);
        t.forward(50);
        t.resetAngle();
        t.penDown = true;
    }
}
