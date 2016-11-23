import java.util.Scanner;

/**
 * Created by javix on 18/10/16.
 */

public class provador {
    public static void main(String[] args) {
        System.out.println ("Numero de cuadrados en Horizontal");
        Scanner ET = new Scanner(System.in);
        int qhorizontal = ET.nextInt();
        System.out.println ("Numero de cuadrados en Horizontal");
        Scanner BT = new Scanner(System.in);
        int qvertical = BT.nextInt();
        int Y=0;
        int X=0;

        Turtle t = new Turtle(500, 500);
        int count = 0;
        while (count < qvertical){
            int count2=0;
            t.goTo(Y, X);
            count ++;
            while (count2 <qhorizontal){
                t.resetAngle();
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
                count2++;
            }
            X=X + 50;
        }
        t.show();
    }
}
