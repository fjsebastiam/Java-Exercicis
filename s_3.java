/**
 * Created by javix on 10/11/16.
 */
public class s_3 {
    public static void main(String[] args) {
        String s = "Hola a todos";
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            //Comprova el string i si aquest es troba entre en rang ASCII de les minuscules l'hi suma 32 per a pasarlos
            if (a >= 97 & a <=122){
                a=a-32;
            }
            char lletres=(char)a;
            System.out.print(lletres+" ");
            }
        }
    }
