/**
 * Created by javix on 15/11/16.
 */
public class a_4 {
    public static void main(String[] args) {
        int[] arrayProva = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int j=arrayProva.length;
        int max =arrayProva.length/2;
        for(int i=0;i<max; i++){
            j--;
            int save =arrayProva[i];
            arrayProva[i] =arrayProva[j];
            arrayProva[j] = save;
        }
        for (int c=0;c <arrayProva.length;c++){
            System.out.print(" "+arrayProva[c]);

        }
    }
}
