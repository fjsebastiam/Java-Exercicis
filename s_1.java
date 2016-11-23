/**
 * Created by javix on 9/11/16.
 */
public class s_1 {
    public static void main(String[] args) {
        String s = "Hola".toLowerCase();
        int contadorVocales = 0;
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contadorVocales++;
                default:
                    //No hacer nada
            }
        }
        System.out.print(contadorVocales);
    }
}
