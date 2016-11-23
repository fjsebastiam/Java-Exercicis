/**
 * Created by javix on 15/11/16.
 */
public class a_3 {
        public static int [] invertir (int[] array) {
            int[] a = new int[array.length];
            for (int i = 0, j= a.length-1; i<array.length; i++, j--){
                a [i]=array[j];
            }
            return a;
        }

        public static void main(String[] args) {
            int[] array = {1,2,3,4,5,6,7,8,9,10};

            array = invertir(array);
            for (int i: array){
                System.out.print(i + " ");
            }
        }
    }