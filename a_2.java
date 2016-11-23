/**
 * Created by javix on 15/11/16.
 */
public class a_2 {
    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[1000];
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        System.out.println("Element 1 at index 0: " + anArray[1000]);
        //No funciona perque no la posicio 1000 de 1000 no existeix, ya que les posicions començen en 0
    }
}
