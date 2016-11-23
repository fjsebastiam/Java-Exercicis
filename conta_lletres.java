/**
 * Created by javix on 20/10/16.
 */
public class conta_lletres {
    public static void main(String[] args) {
        String S= "HOLA";
        int l= S.length();
        //char C = S.charAt(1);
        //System.out.println(c);
        for (int i=0; i<l; i++) {
            char c = S.charAt(i);
            c = (char) (c + 32);
            System.out.println(c);
        }
    }
}
